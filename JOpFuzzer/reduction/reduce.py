import os

from util import global_var


def reduce(jvm_path, cmd, pid):
    prefix, options, suffix = get_options(cmd)
    options, flag = dd_config(jvm_path, prefix, options, suffix, pid)
    bug_path = global_var.get_value("BugPath")
    if flag == 1:
        reduction = open(bug_path + pid + "reduced.txt", "w")
        reduction.write(options)
        reduction.close()
        os.system("rm *.log")
        return
    rm_config(jvm_path, prefix, options, suffix, pid)
    os.system("rm *.log")


def rm_config(jvm_path, prefix, options, suffix, pid):
    bug_path = global_var.get_value("BugPath")
    report_path = global_var.get_value("ReportPath")
    suspicious_option = []
    for _ in range(len(options)):
        option = options.pop()
        new_cmd = " ".join(prefix + options + suspicious_option + suffix)
        new_cmd = new_cmd.replace("assembly", "tmp")
        res = os.system(jvm_path + new_cmd)
        if res != 0 or compare_result(report_path + pid + "tmp.txt", report_path + "repair.txt") == -1:
            suspicious_option.append(option)
    reduction = open(bug_path + pid + "reduced.txt", "w")
    for option in suspicious_option:
        reduction.write(option + "\t")
    reduction.close()


def compare_result(file, repair_file):
    for line in repair_file.splitlines():
        if line == "":
            continue
        if file.find(line + "\n") == -1:
            return -1
        file = file.replace(line + "\n", "")
    return 1


def dd_config(jvm_path, prefix, options, suffix, pid):
    report_path = global_var.get_value("ReportPath")
    config = options
    i = 2
    gap = len(options)
    while gap != 1:
        gap = len(config) // i
        for j in range(i):
            config_tested = config[j * gap:j * gap + gap]
            cmd = " ".join(prefix + config_tested + suffix)
            cmd = cmd.replace("assembly", "tmp")
            res = os.system(jvm_path + cmd)
            if res != 0 or compare_result(report_path + pid + "tmp.txt", report_path + "repair.txt") == -1:
                config = config_tested
                i = 2
                break
        i *= 2
        if len(config) == 1:
            return config, 1
    return config, 0


def get_options(line):
    items = line.split(" ")
    options = [i for i in items if i.startswith("-XX:") and "-XX:CompileCommand" not in i]
    prefix = [i for i in items[:items.index(options[0])] if "-XX:CompileCommand" not in i]
    suffix = items[items.index(options[-1]):]
    return prefix, options, suffix
