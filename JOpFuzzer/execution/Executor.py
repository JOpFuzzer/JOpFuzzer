from distutils.command.config import config
import os.path
from reduction.reduce import reduce
from util import global_var
from util.numeric_option import numeric_option_dict
import pandas as pd

DIAGNOSTIC_EXPERIMENTAL = "-XX:+UnlockDiagnosticVMOptions -XX:+UnlockExperimentalVMOptions " \
                          "-XX:+IgnoreUnrecognizedVMOptions "
RM_HOTSPOT = "rm ./hotspot_pid*\n"
RM_REPLAY = "rm ./replay_pid*\n"
OPTION_PATH = "../../options/"
SLASH = "/"


def prepare(path):
    if not os.path.exists(path):
        os.makedirs(path)


def log(cmd, log_path):
    error = open(log_path + "log", "w")
    error.write(cmd)
    error.close()


def compare_result(file, repair_file):
    f = open(file).read()
    rf = open(repair_file).read()
    for line in rf.splitlines():
        if line == "":
            continue
        if f.find(line + "\n") == -1:
            return -1
    return 1


def exec_sh(jvm_path, cmd, pid):
    report_path = global_var.get_value("ReportPath")
    bug_path = global_var.get_value("BugPath")
    prepare(report_path + pid)
    res = os.system(jvm_path + cmd)
    if res != 0:
        prepare(bug_path + pid)
        print("\nThe test " + pid + " fails to run\n")
        log(jvm_path + cmd, bug_path + pid)
        os.system("mv hs_err_pid* " + report_path + pid + "\n")
        os.system(RM_HOTSPOT)
        os.system(RM_REPLAY)
        reduce(jvm_path, cmd, pid)
        return 0
    res = compare_result(report_path + pid + "assembly.txt", report_path + "repair.txt")
    if res == -1:
        prepare(bug_path + pid)
        print("\nThe test " + pid + " fails to run\n")
        log(jvm_path + cmd, bug_path + pid)
        reduce(jvm_path, cmd, pid)
        return 0
    print("\nThe " + pid + " config runs successfully\n")
    return 1


def select_option(target_config):
    jdk_version = global_var.get_value("JDKVersion")
    config = pd.read_csv(OPTION_PATH + jdk_version + ".csv")["Name"]
    all_config = config.tolist() + list(numeric_option_dict.keys())
    vector = target_config.tolist()
    options = []
    for index, (boolean, option) in enumerate(zip(vector, all_config)):
        if index < len(config):
            if boolean == 1:
                options.append("-XX:+" + option)
            else:
                options.append("-XX:-" + option)
        else:
            options.append("-XX:" + option + "=" + str(numeric_option_dict.get(option)[boolean]))
            if option == "MaxNodeLimit":
                if boolean == 0:
                    options.append("-XX:NodeLimitFudgeFactor=20")
                else:
                    options.append("-XX:NodeLimitFudgeFactor=286331152")
    return " ".join(options) + " "


def make_command(target_config, pid):
    benchmark = global_var.get_value("Benchmark")
    bench_cmd = get_benchmark_cmd(benchmark)
    report_path = global_var.get_value("ReportPath")
    cmd = "/java -Xcomp "
    cmd += DIAGNOSTIC_EXPERIMENTAL
    cmd += "-XX:CompileCommand=print,\"*rg/" + benchmark[:-1] + "*.*\" "
    config = select_option(target_config)
    cmd += config
    cmd += bench_cmd + " > " + report_path + pid + "assembly.txt "
    return cmd


def get_benchmark_cmd(benchmark):
    cmd = ""
    if benchmark == "sunflow":
        cmd = "-cp lib/janino-2.5.15.jar:. org.sunflow.Benchmark -bench 2 256"
    elif benchmark == "avrora":
        cmd = "avrora.Main -action=cfg example.asm"
    elif benchmark == "eclipse":
        cmd = "org.eclipse.core.runtime.adaptor.EclipseStarter -debug"
    elif benchmark == "fop":
        cmd = "-cp lib/xmlgraphics-commons-1.3.1.jar:lib/commons-logging.jar:lib/avalon-framework-4.2.0.jar:lib/batik-all.jar:lib/commons-io-1.3.1.jar:. org.apache.fop.cli.Main -xml name.xml -xsl name2fo.xsl -pdf name.pdf"
    elif benchmark == "jython":
        cmd = "-cp lib/guava-r07.jar:lib/constantine.jar:lib/jnr-posix.jar:lib/jaffl.jar:lib/jline-0.9.95-SNAPSHOT.jar:lib/antlr-3.1.3.jar:lib/asm-3.1.jar:. org.python.util.jython hello.py"
    elif benchmark == "pmd":
        cmd = "-cp lib/jaxen-1.1.1.jar:lib/asm-3.1.jar:. net.sourceforge.pmd.PMD Hello.java text unusedcode"
    return cmd


def execute(config, pid):
    print("\nThe " + pid + " config starts to run\n")
    cmd = make_command(config, pid)
    jdk_path = global_var.get_value("JDKPath")
    res = exec_sh(jdk_path, cmd, pid)
    return res
