// Name:        TimeJumpWithWait.java
//
// Description: A program for testing system time jumps with wait calls.
//      The main() function uses two worker threads to test for problems
//      with changing the system time during a wait() call.
//
//      Worker-0 changes the system time 5 years into the future and
//      waits for 10 seconds. Worker-1 changes the system time back
//      while Worker-0 is waiting and then checks to see if Worker-0
//      returns from wait() in the "right" amount of time.
//
//      If Worker-0 does not return from wait() in the "right" amount
//      of time, then Worker-1 changes the system time 5 years into the
//      future, waits for 10 seconds and then checks to see if Worker-0
//      is stuck or not.
//
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TimeJumpWithWait {
    static final public int N_THREADS = 2;
    // save the current date and time
    static final public GregorianCalendar NOW = new GregorianCalendar();
    // convert NOW into a date cmd param
    static final public String NOW_DATE_PARAM = convertNowToDateParam();
    // convert NOW + 5-years into a date cmd param
    static final public String FUTURE_DATE_PARAM = convertNowToDateParam(5);

    static volatile boolean testError = false;

    // Convert NOW to a date cmd parameter.
    static String convertNowToDateParam() {
        return convertNowToDateParam(0);
    }

    // Convert NOW + addToYear to a date cmd parameter.
    // The "date" cmd parameter format: MMDDhhmmCCYY.
    static String convertNowToDateParam(int addToYear) {
        // Calendar.MONTH is zero based
        String month  = "" + (NOW.get(Calendar.MONTH) + 1);
        if (month.length() == 1) {
            month = "0" + month;
        }
        String day    = "" + NOW.get(Calendar.DAY_OF_MONTH);
        if (day.length() == 1) {
            day = "0" + day;
        }
        String hour   = "" + NOW.get(Calendar.HOUR_OF_DAY);
        if (hour.length() == 1) {
            hour = "0" + hour;
        }
        String minute = "" + NOW.get(Calendar.MINUTE);
        if (minute.length() == 1) {
            minute = "0" + minute;
        }
        String year   = "" + (NOW.get(Calendar.YEAR) + addToYear);

        return month + day + hour + minute + year;
    }

    public static void main(String[] args) {
        System.out.println("Hello from TimeJumpWithWait!");

        int        t;
        WaitWorker threads[] = new WaitWorker[N_THREADS];

	// create the WaitWorker(s):
        for (t = 0; t < N_THREADS; t++) {
            threads[t] = new WaitWorker("Worker-" + t);
        }

        // start the WaitWorker(s) running:
        for (t = 0; t < N_THREADS; t++) {
            threads[t].start();
        }

        // Wait for the WaitWorker(s) to finish in reverse order
        // since Worker-0 might get stuck.
        for (t = N_THREADS - 1; t >= 0; t--) {
            try {
                threads[t].join();
            } catch (InterruptedException ie) {
            }

            if (t == 0) {
                // Worker-1 already reported status
                continue;
            }

            if (WaitWorker.worker0WaitWorked) {
                System.out.println("PASS: wait() worked as expected.");
            } else {
                throw new RuntimeException("FAIL: wait() did not work " +
                    "as expected.");
            }
            if (WaitWorker.worker0IsStuck) {
                System.err.println("FAIL: Worker-0 is stuck in wait().");
                // don't try to join() Worker-0
                break;
            }
        }

        if (testError) {
            throw new RuntimeException("FAIL: test failed with an error.");
        }

        System.out.println("Bye from TimeJumpWithWait!");
    }
}


class WaitWorker extends Thread {
    static final public int SLEEP_TIME = 10 * 1000;  // 10 seconds
    static final public int WAIT_CNT_MAX = 3;  // at most wait 3X

    static private Object   barrier = new Object();
    static volatile boolean timeSetForward = false;
    static volatile boolean worker0IsDoneWaiting = false;
    static volatile boolean worker0IsRunning = false;
    static volatile boolean worker0IsStuck = false;
    static volatile boolean worker0WaitWorked = false;

    public WaitWorker(String name) {
        super(name);
    }

    public void run() {
        System.out.println("WaitWorker: '" + getName() + "' is running.");

        if (getName().equals("Worker-0")) {
            synchronized (barrier) {
                worker0IsRunning = true;
                try {
                    barrier.wait();
                } catch (InterruptedException ie) {
                }
            }

            synchronized (barrier) {
                setTimeForward();
                timeSetForward = true;

                try {
                    barrier.wait(SLEEP_TIME);
                } catch (InterruptedException ie) {
                }
            }
            worker0IsDoneWaiting = true;
        } else {
            synchronized (barrier) {
                while (!worker0IsRunning) {
                    // wait for Worker-0 to block
                    try {
                        barrier.wait(500);
                    } catch (InterruptedException ie) {
                    }
                }
                // when we get here Worker-0 is waiting
                barrier.notifyAll();

                // Wait for Worker-0 to set the time forward.
                // This thread always waits at least 1 second.
                while (!timeSetForward) {
                    try {
                        barrier.wait(1000);
                    } catch (InterruptedException ie) {
                    }
                }
                // When Worker-1 gets here Worker-0 is already in its
                // barrier.wait(SLEEP_TIME) so we are ready to test.
            }

            // Setting the time backward might confuse Worker-0's
            // wait() call causing it to wait too long.
            setTimeBackward();

            int waitCnt = 0;
            while (!worker0IsDoneWaiting && waitCnt++ < WAIT_CNT_MAX) {
                try {
                    Thread.sleep(SLEEP_TIME);
                } catch (InterruptedException ie) {
                }
            }
            // At this point, Worker-1 has waited WAIT_CNT_MAX times
            // longer than Worker-0 so Worker-0 should have woken up.

            if (worker0IsDoneWaiting) {
                System.out.println("INFO: Worker-0 woke up.");
                worker0WaitWorked = true;
            } else {
                System.out.println("INFO: Worker-0 is still waiting.");

                // let's see if Worker-0 is stuck
                setTimeForward();

                try {
                    Thread.sleep(SLEEP_TIME + 1000);
                } catch (InterruptedException ie) {
                }
                // At this point, Worker-1 has waited longer than Worker-0
                // so Worker-0 should have woken up.

                if (worker0IsDoneWaiting) {
                    System.out.print("INFO: Worker-0 woke up ");
                } else {
                    System.out.print("INFO: Worker-0 is still waiting ");
                    worker0IsStuck = true;
                }
                System.out.println("after time was jumped forward again.");

                // Restore system time back to when the test was
                // started. This is not a correct value, but it's
                // closer than 5 years in the future.
                setTimeBackward();
            }
        }

        System.out.println("WaitWorker: '" + getName() + "' is done.");
    }

    private void runDateCmd(String param) {
        Process p = null;
        try {
            p = Runtime.getRuntime().exec("date " + param);
        } catch (IOException ioe) {
            TimeJumpWithWait.testError = true;
            throw new RuntimeException("ERROR: 'date " + param +
                                       "' cmd failed due to: " + ioe);
        }

        int exitCode = -1;
        try {
            exitCode = p.waitFor();
        } catch (InterruptedException ie) {
        }

        if (exitCode != 0) {
            TimeJumpWithWait.testError = true;
            throw new RuntimeException("ERROR: 'date " + param +
                                       "' cmd failed with exitCode==" +
                                       exitCode);
        }

        System.out.println("INFO: time is now: " + new GregorianCalendar());
    }

    private void setTimeBackward() {
        System.out.println("INFO: setting time backward to:");
        System.out.println("INFO: MMDDhhmmCCYY");
        System.out.println("INFO: " + TimeJumpWithWait.NOW_DATE_PARAM);
        runDateCmd(TimeJumpWithWait.NOW_DATE_PARAM);
    }

    private void setTimeForward() {
        System.out.println("INFO: setting time forward to:");
        System.out.println("INFO: MMDDhhmmCCYY");
        System.out.println("INFO: " + TimeJumpWithWait.FUTURE_DATE_PARAM);
        runDateCmd(TimeJumpWithWait.FUTURE_DATE_PARAM);
    }
}
