import argparse
import os
from execution.Default import default_execute
from execution.regression_execution import regression_execution
from search.GA import microbial_genetic_algorithm
from util import global_var

DIAGNOSTIC_EXPERIMENTAL = "-XX:+UnlockDiagnosticVMOptions -XX:+UnlockExperimentalVMOptions " \
                          "-XX:+IgnoreUnrecognizedVMOptions "
BUG_DIR = "../../bug/"
REPORT_DIR = "../../report/"
SLASH = "/"
parser = argparse.ArgumentParser(description="Choose the path of the JVM and the benchmark.")
parser.add_argument("JDKPath", metavar="JDKPath", type=str, help="The path to the JVM tested")
parser.add_argument("JDKVersion", metavar="JDKVersion", type=str,
                    help="The version of the JVM tested (e.g., Openjdk11, see details in directory options)")
parser.add_argument("Benchmark", metavar="Benchmark", type=str,
                    help="The benchmark used as seed (avrora, eclipse, fop, jython, pmd, sunflow, and regression)")


def create_global_var(args):
    global_var.init()
    global_var.set_value("JDKPath", args.JDKPath + "/bin")
    global_var.set_value("JDKVersion", args.JDKVersion)
    global_var.set_value("ReportPath", REPORT_DIR + args.JDKVersion + SLASH)
    global_var.set_value("BugPath", "../../bug/")
    global_var.set_value("Benchmark", args.Benchmark)


def change_dir():
    benchmark = global_var.get_value("Benchmark")
    if benchmark == "sunflow":
        os.chdir("./benchmark/sunflow-0.07.2")
    elif benchmark == "avrora":
        os.chdir("./benchmark/avrora-cvs-20091224")
    elif benchmark == "eclipse":
        os.chdir("./benchmark/eclipse-dacapo")
    elif benchmark == "fop":
        os.chdir("./benchmark/fop-dacapo")
    elif benchmark == "jython":
        os.chdir("./benchmark/jython-dacapo")
    elif benchmark == "pmd":
        os.chdir("./benchmark/pmd-4.2.5")


def OpTuner():
    args = parser.parse_args()
    create_global_var(args)
    print("\n*****The test starts*****\n")
    if args.Benchmark == "regression":
        regression_execution()
    change_dir()
    default_execute()
    print("\n*****The Genetic iterations start*****\n")
    microbial_genetic_algorithm()


if __name__ == '__main__':
    OpTuner()
