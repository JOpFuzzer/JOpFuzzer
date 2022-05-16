import re
import os
import collections
import pandas as pd
from statistics import mean


class Log:

    def __init__(self):
        self.changed = 0
        self.insertions = 0
        self.deletions = 0
        self.source_file = []
        self.key = []

    def mod_changed(self, changed):
        self.changed += changed

    def get_changed(self):
        return self.changed

    def mod_insertions(self, insertions):
        self.insertions += insertions

    def get_insertions(self):
        return self.insertions

    def mod_deletions(self, deletions):
        self.deletions += deletions

    def get_deletions(self):
        return self.deletions

    def mod_source_file(self, source_file):
        self.source_file.append(source_file)

    def get_source_file(self):
        return self.source_file

    def set_key(self, key):
        self.key = key

    def get_key(self):
        return self.key


def get_keys(comp):  
    path=''
    if comp == 'compiler':
        path="../compiler_data/"
    else:
        path='../data/'
    keys = []
    if comp == 'compiler':
        for file in os.listdir(path):
            if '.DS_Store' in file:
                continue
            df = pd.read_csv(path + file)
            for index,row in df.iterrows(): 
                if row['Component/s'] != 'hotspot':
                    continue            

                keys.append(row['Issue key'])
    if comp == 'runtime':
        for file in os.listdir(path):
            if '.DS_Store' in file:
                continue
            df = pd.read_csv(path + file)
            for index,row in df.iterrows(): 
                if row['Component/s'] != 'hotspot':
                    continue            
                if ('216f1fe7' in str(row['Custom field (Subcomponent)'])) or ('368c800d' in str(row['Custom field (Subcomponent)'])) or ('a4a38a9' in str(row['Custom field (Subcomponent)'])) :
                    keys.append(row['Issue key']) 
    if comp == 'gc':
        for file in os.listdir(path):
            if '.DS_Store' in file:
                continue
            df = pd.read_csv(path + file)
            for index,row in df.iterrows(): 
                if row['Component/s'] != 'hotspot':
                    continue            
                elif ('5d640af4' in str(row['Custom field (Subcomponent)'])) or ('2e4eb2bc' in str(row['Custom field (Subcomponent)'])) or ('400daccd' in str(row['Custom field (Subcomponent)'])) or ('723b1f03' in str(row['Custom field (Subcomponent)'])):
                    keys.append(row['Issue key'])
    if comp == 'svc':
        for file in os.listdir(path):
            if '.DS_Store' in file:
                continue
            df = pd.read_csv(path + file)
            for index,row in df.iterrows(): 
                if row['Component/s'] != 'hotspot':
                    continue            
                elif ('1a7ea3f0' in str(row['Custom field (Subcomponent)'])) or ('22ed5982' in str(row['Custom field (Subcomponent)'])) or ('326b62a5' in str(row['Custom field (Subcomponent)'])) or ('391247c' in str(row['Custom field (Subcomponent)'])) or ('45a85b32' in str(row['Custom field (Subcomponent)'])) or ('4fe221f' in str(row['Custom field (Subcomponent)'])):
                    keys.append(row['Issue key'])
    if comp == 'all':
        for file in os.listdir(path):
            if '.DS_Store' in file:
                continue
            df = pd.read_csv(path + file)
            for index,row in df.iterrows(): 
                if row['Component/s'] != 'hotspot':
                    continue            

                keys.append(row['Issue key'])                                
           
    # f = open(path + "id.txt", "w")
    # f.write("\n".join(keys))
    print(keys)
    return keys


def modify(keys):
    for i in range(len(keys)):
        keys[i] = keys[i].replace("JDK-", "")
    return keys


def gen_changed_source_file(line, log):
    if "src" in line:
        if "=>" in line:
            log.mod_changed(1)
            return
        insertion, deletion, source_file = re.findall(r"[A-Za-z_+\-$@\d/.]+", line)
        if insertion != "-" and deletion != "-":
            log.mod_insertions(int(insertion))
            log.mod_deletions(int(deletion))
            log.mod_source_file(source_file)
        log.mod_changed(1)


def get_review_index(lines):
    for i, line in enumerate(lines):
        if "Reviewed-by:" in line:
            return i


def analyze_commits(commits):
    logs = []
    for commit in commits:
        lines = commit.splitlines()
        review_index = get_review_index(lines)
        if review_index is None:
            continue

        log = Log()
        indices = []
        for line in lines[4:review_index - 1]:
            index = re.search(r"\d+:", line.strip())
            if index is not None:
                index = index.group().replace(":", "")
                indices.append(index)
        log.set_key(indices)
        for line in lines[::-1]:
            if line == "":
                break
            gen_changed_source_file(line, log)
        logs.append(log)
    return logs


def get_commit_keys(logs):
    keys = []
    for log in logs:
        keys += log.get_key()
    return keys


def count_compiler_number(compiler_key, logs, file_name,component):
    changed = []
    insertions = []
    deletions = []
    for log in logs:
        keys = log.get_key()
        for key in keys:
            if key in compiler_key:
                changed.append(log.get_changed())
                insertions.append(log.get_insertions())
                deletions.append(log.get_deletions())
                break
    print("version\tchanged\tinsertions\tdeletions")
    print(file_name + ":\t" + str(mean(changed)) + "\t" + str(mean(insertions)) + "\t" + str(mean(deletions)))
    
    if component == 'compiler':
        with open('../fixsizedata/comcha.txt','w') as f:
            for i in changed:
                f.write(str(i)+'\n')
        with open('../fixsizedata/comins.txt','w') as f:
            for i in insertions:
                f.write(str(i)+'\n')
        with open('../fixsizedata/comdele.txt','w') as f:
            for i in deletions:
                f.write(str(i)+'\n')    
    elif component == 'runtime':
        with open('../fixsizedata/runcha.txt','w') as f:
            for i in changed:
                f.write(str(i)+'\n')
        with open('../fixsizedata/runins.txt','w') as f:
            for i in insertions:
                f.write(str(i)+'\n')
        with open('../fixsizedata/rundele.txt','w') as f:
            for i in deletions:
                f.write(str(i)+'\n')  
    if component == 'gc':
        with open('../fixsizedata/gccha.txt','w') as f:
            for i in changed:
                f.write(str(i)+'\n')
        with open('../fixsizedata/gcins.txt','w') as f:
            for i in insertions:
                f.write(str(i)+'\n')
        with open('../fixsizedata/gcdele.txt','w') as f:
            for i in deletions:
                f.write(str(i)+'\n')  
    if component == 'svc':
        with open('../fixsizedata/svccha.txt','w') as f:
            for i in changed:
                f.write(str(i)+'\n')
        with open('../fixsizedata/svcins.txt','w') as f:
            for i in insertions:
                f.write(str(i)+'\n')
        with open('../fixsizedata/svcdele.txt','w') as f:
            for i in deletions:
                f.write(str(i)+'\n')  
    if component == 'all':
        with open('../fixsizedata/allcha.txt','w') as f:
            for i in changed:
                f.write(str(i)+'\n')
        with open('../fixsizedata/allins.txt','w') as f:
            for i in insertions:
                f.write(str(i)+'\n')
        with open('../fixsizedata/alldele.txt','w') as f:
            for i in deletions:
                f.write(str(i)+'\n')  
                
    
def get_basename(source_files):
    return [os.path.basename(file) for file in source_files]


def analyze_source_file(compiler_keys, logs, file_name):
    print()
    files = []
    compiler_issue_keys = []
    for log in logs:
        keys = log.get_key()
        for key in keys:
            if key in compiler_keys:
                files += get_basename(log.get_source_file())
                compiler_issue_keys.append(key)
    file_count = collections.Counter(files)
    res = sorted(file_count, key=lambda file: (-file_count[file], file))
    for i in res[:10]:  # top-10
        print(file_name + ":\t" + i + "\t" + str(file_count[i]))
    return compiler_issue_keys


def get_commits(component):
    #files = ["openjdk.txt", "openjdk8.txt", "openjdk11.txt", "openjdk17.txt"]
    files = ["openjdk.txt"]
    keys = get_keys(component)
    keys = modify(keys)
    for file in files:
        commits = []
        f = open(file, "r",encoding='UTF-8').read()
        sub = "commit [a-z0-9]+\nAuthor"
        indices = [substr.start() for substr in re.finditer(sub, f)]
        for i in range(len(indices)):
            if i == len(indices) - 1:
                commit = f[indices[i]:]
            else:
                commit = f[indices[i]:indices[i + 1] - 1]
            commits.append(commit)
        logs = analyze_commits(commits)
        count_compiler_number(keys, logs, file, component)
        compiler_key = analyze_source_file(keys, logs, file)

if __name__ == '__main__':
    get_commits('compiler')
    get_commits('runtime')
    get_commits('gc')
    get_commits('svc')
    get_commits('all')
    