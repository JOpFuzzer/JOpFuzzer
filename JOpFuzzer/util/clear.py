import os


def remove_redundant_dir(path="./OpTuner/bug/"):
    for dir in os.listdir(path):
        dir = path + dir + "/"
        for subDir in os.listdir(dir):
            subDir = dir + subDir + "/"
            for pidDir in os.listdir(subDir):
                pidDir = subDir + pidDir
                if os.path.isfile(pidDir):
                    os.system("rm -rf " + pidDir)
                elif "default" not in pidDir:
                    flag = 0
                    for file in os.listdir(pidDir):
                        if "hs_err" in file:
                            flag = 1
                            break
                    if flag == 0:
                        os.system("rm -rf " + pidDir)


remove_redundant_dir()
