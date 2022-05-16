from util import global_var
from search.assembly import Assembly
from search.vsm import *
import re

COMPILE_METHOD = "Compiled method"
METHODS = "  # {method}"


def calculate_fitness(pid):
    report_path =  global_var.get_value("ReportPath") + pid
    default = open(report_path + "default.txt", encoding="windows-1254").read()
    repair_file = open(report_path + "repair.txt", encoding="windows-1254").read()
    target = open(report_path + pid + "assembly.txt", encoding="windows-1254").read()
    default = repair(default, repair_file)
    target = repair(target, repair_file)
    default_methods = cut_method(default)
    target_methods = cut_method(target)
    default_assembly = []
    target_assembly = []
    for method in default_methods:
        if len(method) != 2:
            continue
        default_assembly.append(Assembly(method[0], method[1]))
    for method in target_methods:
        if len(method) != 2:
            continue
        target_assembly.append(Assembly(method[0], method[1]))
    res = np.zeros(len(default_assembly))
    index = 0
    for default in default_assembly:
        for target in target_assembly:
            if default.signature == target.signature and default.level == target.level:
                res[index] = calculate(default, target)
                break
        index += 1
    res = normalize(default_assembly, res)
    return np.linalg.norm(res)


def normalize(default_assembly, res):
    n = len(default_assembly)
    weights = np.zeros(n)
    count = 0
    for i in range(n):
        line_number = len(default_assembly[i].opcodes)
        weights[i] = line_number
        count += line_number
    weights = np.divide(weights, count)
    return np.dot(res, weights)


def calculate(default, target):
    coarse = coarse_cal(default, target)
    if coarse:
        return coarse
    else:
        return fine_cal(default, target)


def coarse_cal(default, target):
    if default.metadata == target.metadata:
        return 1
    else:
        return 0


def fine_cal(default, target):
    return vsm(default.opcodes, target.opcodes)


def repair(file, repair_file):
    for line in repair_file.splitlines():
        if line == "":
            continue
        file = file.replace(line + "\n", "")
    lines = file.split("\n")
    for i in range(len(lines)):
        if COMPILE_METHOD in lines[i] and not lines[i].startswith(COMPILE_METHOD):
            index = lines[i].find(COMPILE_METHOD)
            lines[i] = lines[i][:index] + "\n" + lines[i][index:]
    file = "\n".join(lines)
    return file


def cut_method(file):
    methods = []
    indices = []
    for match in re.finditer(COMPILE_METHOD, file):
        indices.append(match.start())
    for i in range(len(indices)):
        if i == len(indices) - 1:
            method = file[indices[i]:]
        else:
            method = file[indices[i]:indices[i + 1]]
        methods.append(method.split(METHODS))
    return methods

