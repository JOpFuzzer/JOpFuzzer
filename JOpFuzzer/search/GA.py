import os
import numpy as np
import uuid
import pandas as pd
from execution.Executor import execute, OPTION_PATH
from util import global_var
from search.fitness import calculate_fitness
from util.numeric_option import numeric_option_dict

CROSS_RATE = 0.6  # Probability of crossover
MUTATION_RATE = 0.2  # Probability of mutation
CONFIG_NUM = 100  # The total number of config that the population contains
SIMILARITY_THRESHOLD = 0.3
GENERATION_NUM = 100  # Number of rounds of mutation
EVOLVE_NUM = 20  # The number of config recombination in each round of mutation


def get_fitness(sub_pop):
    report_path = global_var.get_value("ReportPath")
    config1 = sub_pop[0]
    config2 = sub_pop[1]
    pid1 = str(uuid.uuid1()) + "/"
    res1 = execute(config1, pid1)
    if res1:
        fitness1 = calculate_fitness(pid1)
    else:
        fitness1 = 1
    pid2 = str(uuid.uuid1()) + "/"
    res2 = execute(config2, pid2)
    if res2:
        fitness2 = calculate_fitness(pid2)
    else:
        fitness2 = 1
    os.system("rm -rf " + report_path + pid1)
    os.system("rm -rf " + report_path + pid2)
    return [fitness1, fitness2]


class MGA:
    def __init__(self, config_length, cross_rate, mutation_rate, config_num):
        self.config_length = config_length
        self.cross_rate = cross_rate
        self.mutate_rate = mutation_rate
        self.config_num = config_num
        self.config = [np.random.randint(0, 2, self.config_length) for _ in range(self.config_num)]

    def crossover(self, loser_winner):
        for i in range(self.config_length - 2):
            if np.random.rand() < self.cross_rate:
                loser_winner[0][i] = loser_winner[1][i]
        return loser_winner

    def mutate(self, loser_winner):
        for i in range(self.config_length):
            if np.random.rand() < self.mutate_rate:  # mutation index
                loser_winner[0][i] = loser_winner[0][i] ^ 1
        return loser_winner

    def evolve(self, n):
        for _ in range(n):
            sub_config_idx = np.random.choice(np.arange(0, self.config_num), size=2, replace=False)
            sub_config = [self.config[i] for i in sub_config_idx]
            res1, res2 = get_fitness(sub_config)
            if res1 < res2:
                sub_config.reverse()
            elif res1 == res2 == 1:
                for idx in sub_config_idx:
                    self.config.pop(idx)
                    self.config.append(np.random.randint(0, 2, self.config_length))
            loser_winner = self.crossover(sub_config)
            loser_winner = self.mutate(loser_winner)
            self.config[sub_config_idx[0]] = loser_winner[0]
            self.config[sub_config_idx[1]] = loser_winner[1]


def get_config_length():
    jdk_version = global_var.get_value("JDKVersion")
    config = pd.read_csv(OPTION_PATH + jdk_version + ".csv")["Name"].tolist()
    return len(config)


def microbial_genetic_algorithm():
    config_length = get_config_length() + len(numeric_option_dict)
    mga = MGA(config_length, CROSS_RATE, MUTATION_RATE, CONFIG_NUM)
    for _ in range(GENERATION_NUM):
        mga.evolve(EVOLVE_NUM)
