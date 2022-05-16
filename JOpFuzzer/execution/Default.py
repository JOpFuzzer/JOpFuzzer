import os
from util import global_var


def prepare(path):
    if not os.path.exists(path):
        os.makedirs(path)


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


def default_execute():
    default_path = global_var.get_value("ReportPath")
    prepare(default_path)
    jdk_path = global_var.get_value("JDKPath")
    benchmark = global_var.get_value("Benchmark")
    bench_cmd = get_benchmark_cmd(benchmark)
    repair = jdk_path + "/java " + bench_cmd + " > " + default_path + "repair.txt"
    cmd = jdk_path + "/java -Xcomp -XX:CompileCommand=print,\"*rg/" + benchmark[
                                                                      :-1] + "*.*\" " + bench_cmd + " > " + default_path + "default.txt"
    os.system(repair)
    os.system(cmd)
