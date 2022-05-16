import os
import pandas as pd
from util import global_var
from util.numeric_option import numeric_option_dict

OPTION_PATH = "../../options/"


def get_config_length():
    jdk_version = global_var.get_value("JDKVersion")
    config = pd.read_csv(OPTION_PATH + jdk_version + ".csv")["Name"].tolist()
    return len(config)


def regression_execution():
    cmd = "make run-test TEST=hotspot_all"
    os.system(cmd)
    configs = [np.random.randint(0, 2, get_config_length() + len(numeric_option_dict)) for _ in range(100)]
    for config in configs:
        cmd = "make run-test TEST=hotspot_all -vmoption:\"" + select_option(config) + "\""
        os.system(cmd)


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
                    options.append("-XX:NodeLimitFudgeFactor=572662306")
    return " ".join(options) + " "
