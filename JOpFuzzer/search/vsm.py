# 3-gram VSM
import numpy as np


def count_key(function):
    voc = {}
    keys = slide_key(function, 3)
    opcodes = " ".join(function)
    for key in keys:
        voc[key] = opcodes.count(key)
    return voc


def slide_key(opcodes, size=3):
    res = []
    if len(opcodes) < size:
        return " ".join(opcodes)
    for i in range(size):
        term = opcodes[i:i + size]
        if len(term) < size:
            break
        res.append(" ".join(term))
    return res


def merge_key(fun1, fun2):
    key1 = list(fun1.keys())
    key2 = list(fun2.keys())
    return list(set(key1 + key2))


def gen_vector(vocabulary, table):
    res = []
    for term in vocabulary:
        res.append(table.get(term, 0))
    return np.array(res)


def calculate(vector1, vector2):
    dot = np.dot(vector1, vector2)
    norm1 = np.linalg.norm(vector1)
    norm2 = np.linalg.norm(vector2)
    return dot / (norm1 * norm2)


def vsm(function1, function2):
    function1_table = count_key(function1)
    function2_table = count_key(function2)
    vocabulary = merge_key(function1_table, function2_table)
    vector1 = gen_vector(vocabulary, function1_table)
    vector2 = gen_vector(vocabulary, function2_table)
    res = calculate(vector1, vector2)
    return res
