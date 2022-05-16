import pandas as pd
import os
import math
import re
import matplotlib.pyplot as plt
import numpy as np
import scipy.stats as stats
import sys


# Trend graph of the change in the number of HotSpot and Compiler
def num_proportion():
    day = []
    day1 = []
    allnum = []
    comnum = []
    pronum = []
    alldict = {}
    comdict = {}
    ticks = []
    for i in range(2000, 2022):
        for j in range(1, 13):
            a = str(i) + '-' + str(j)
            day1.append(a)
    day1.extend(['2022-1', '2022-2', '2022-3'])

    for i in range(0, len(day1), 3):
        day.append(day1[i])
    # print(day)

    for i in range(0, len(day), 17):
        ticks.append(day[i])
    # ticks.append('2022-3')
    for rootpath, dirpath, filepath in os.walk('../JDK_data'):
        for ifile in filepath:
            path = os.path.join(rootpath, ifile)
            df = pd.read_csv(path)

            for index, row in df.iterrows():
                if row['Component/s'] != 'hotspot':
                    continue
                first = row['Created'].split(' ')[0]
                matchobj = re.match('(.+)-(.+)-(.+)', first)
                fy = int(matchobj.group(1))
                fm = int(matchobj.group(2))
                fd = int(matchobj.group(3))

                if fm < 4:
                    time = str(fy) + '-' + str(1)
                elif fm < 7:
                    time = str(fy) + '-' + str(4)
                elif fm < 10:
                    time = str(fy) + '-' + str(7)
                else:
                    time = str(fy) + '-' + str(10)

                if time in alldict.keys():
                    alldict[time] = alldict[time] + 1
                else:
                    alldict[time] = 1

    for rootpath, dirpath, filepath in os.walk('../Compiler_data'):
        for ifile in filepath:
            path = os.path.join(rootpath, ifile)
            df = pd.read_csv(path)

            for index, row in df.iterrows():
                first = row['Created'].split(' ')[0]
                matchobj = re.match('(.+)-(.+)-(.+)', first)
                fy = int(matchobj.group(1))
                fm = int(matchobj.group(2))
                fd = int(matchobj.group(3))

                if fm < 4:
                    time = str(fy) + '-' + str(1)
                elif fm < 7:
                    time = str(fy) + '-' + str(4)
                elif fm < 10:
                    time = str(fy) + '-' + str(7)
                else:
                    time = str(fy) + '-' + str(10)

                if time in comdict.keys():
                    comdict[time] = comdict[time] + 1
                else:
                    comdict[time] = 1

    for i in day:
        if i in alldict.keys():
            allnum.append(alldict[i])
        else:
            allnum.append(0)

        if i in comdict.keys():
            comnum.append(comdict[i])
            pronum.append(comdict[i] / alldict[i])
        else:
            comnum.append(0)

    fig, ax1 = plt.subplots()
    ax2 = ax1.twinx()
    ax1.plot(day, allnum, '#4169E1')
    ax1.set_ylabel('Number', color='#4169E1')
    ax2.plot(day, pronum, 'r--')
    ax2.set_ylabel('Proportion', color='r')
    plt.grid(axis='both', ls='--')
    plt.xticks(ticks, rotation=45)
    plt.tight_layout()
    plt.show()
    '''

    with open('allnum_proportion.csv','w') as f:
        for i in allnum:
            f.write(str(i)+',')
        f.write('\n')
        for i in pronum:
            f.write(str(i)+',')

    '''


def draw_priorty():
    ps1 = []
    ps2 = []
    ps3 = []
    ps4 = []
    ps5 = []
    # xbar = ['JIT Compiler','Runtime','All','GC','Other','JFR','SVC','JVMTI']
    xbar = ['compiler', 'runtime', 'all', 'gc', 'other', 'jfr', 'svc', 'jvmti']
    ind = [8, 7, 6, 5, 4, 3, 2, 1]

    for i in xbar:
        a = 0
        b = 0
        c = 0
        d = 0
        e = 0

        if i == 'all':
            for rootpath, dirpath, filepath in os.walk('../JDK_data'):
                for ifile in filepath:
                    path = os.path.join(rootpath, ifile)
                    df = pd.read_csv(path)

                    for index, row in df.iterrows():
                        if row['Component/s'] != 'hotspot':
                            continue
                        if row['Priority'] == 'P1':
                            a = a + 1
                        elif row['Priority'] == 'P2':
                            b = b + 1
                        elif row['Priority'] == 'P3':
                            c = c + 1
                        elif row['Priority'] == 'P4':
                            d = d + 1
                        elif row['Priority'] == 'P5':
                            e = e + 1
            total = a + b + c + d + e
            ps1.append(a / total)
            ps2.append(b / total)
            ps3.append(c / total)
            ps4.append(d / total)
            ps5.append(e / total)
            continue

        if i == 'compiler':
            for rootpath, dirpath, filepath in os.walk('../Compiler_data'):
                for ifile in filepath:
                    path = os.path.join(rootpath, ifile)
                    df = pd.read_csv(path)

                    for index, row in df.iterrows():
                        if row['Priority'] == 'P1':
                            a = a + 1
                        elif row['Priority'] == 'P2':
                            b = b + 1
                        elif row['Priority'] == 'P3':
                            c = c + 1
                        elif row['Priority'] == 'P4':
                            d = d + 1
                        elif row['Priority'] == 'P5':
                            e = e + 1
            total = a + b + c + d + e
            ps1.append(a / total)
            ps2.append(b / total)
            ps3.append(c / total)
            ps4.append(d / total)
            ps5.append(e / total)
            continue

        if i == 'gc':
            for rootpath, dirpath, filepath in os.walk('../JDK_data'):
                for ifile in filepath:
                    path = os.path.join(rootpath, ifile)
                    df = pd.read_csv(path)

                    for index, row in df.iterrows():
                        if row['Component/s'] == 'hotspot' and (
                                ('5d640af4' in str(row['Custom field (Subcomponent)'])) or (
                                '2e4eb2bc' in str(row['Custom field (Subcomponent)'])) or (
                                        '400daccd' in str(row['Custom field (Subcomponent)'])) or (
                                        '723b1f03' in str(row['Custom field (Subcomponent)']))):
                            if row['Priority'] == 'P1':
                                a = a + 1
                            elif row['Priority'] == 'P2':
                                b = b + 1
                            elif row['Priority'] == 'P3':
                                c = c + 1
                            elif row['Priority'] == 'P4':
                                d = d + 1
                            elif row['Priority'] == 'P5':
                                e = e + 1
            total = a + b + c + d + e
            ps1.append(a / total)
            ps2.append(b / total)
            ps3.append(c / total)
            ps4.append(d / total)
            ps5.append(e / total)

        if i == 'jfr':
            for rootpath, dirpath, filepath in os.walk('../JDK_data'):
                for ifile in filepath:
                    path = os.path.join(rootpath, ifile)
                    df = pd.read_csv(path)

                    for index, row in df.iterrows():
                        if row['Component/s'] == 'hotspot' and (
                                ('586bfeff' in str(row['Custom field (Subcomponent)'])) or (
                                '28f62291' in str(row['Custom field (Subcomponent)'])) or (
                                        '646b6bfe' in str(row['Custom field (Subcomponent)']))):
                            if row['Priority'] == 'P1':
                                a = a + 1
                            elif row['Priority'] == 'P2':
                                b = b + 1
                            elif row['Priority'] == 'P3':
                                c = c + 1
                            elif row['Priority'] == 'P4':
                                d = d + 1
                            elif row['Priority'] == 'P5':
                                e = e + 1
            total = a + b + c + d + e
            ps1.append(a / total)
            ps2.append(b / total)
            ps3.append(c / total)
            ps4.append(d / total)
            ps5.append(e / total)

        if i == 'jvmti':
            for rootpath, dirpath, filepath in os.walk('../JDK_data'):
                for ifile in filepath:
                    path = os.path.join(rootpath, ifile)
                    df = pd.read_csv(path)

                    for index, row in df.iterrows():
                        if row['Component/s'] == 'hotspot' and (
                                ('76518167' in str(row['Custom field (Subcomponent)'])) or (
                                '3f3d9c09' in str(row['Custom field (Subcomponent)'])) or (
                                        '617d0cb8' in str(row['Custom field (Subcomponent)']))):
                            if row['Priority'] == 'P1':
                                a = a + 1
                            elif row['Priority'] == 'P2':
                                b = b + 1
                            elif row['Priority'] == 'P3':
                                c = c + 1
                            elif row['Priority'] == 'P4':
                                d = d + 1
                            elif row['Priority'] == 'P5':
                                e = e + 1
            total = a + b + c + d + e
            ps1.append(a / total)
            ps2.append(b / total)
            ps3.append(c / total)
            ps4.append(d / total)
            ps5.append(e / total)

        if i == 'runtime':
            for rootpath, dirpath, filepath in os.walk('../JDK_data'):
                for ifile in filepath:
                    path = os.path.join(rootpath, ifile)
                    df = pd.read_csv(path)

                    for index, row in df.iterrows():
                        if row['Component/s'] == 'hotspot' and (
                                ('216f1fe7' in str(row['Custom field (Subcomponent)'])) or (
                                '368c800d' in str(row['Custom field (Subcomponent)'])) or (
                                        'a4a38a9' in str(row['Custom field (Subcomponent)']))):
                            if row['Priority'] == 'P1':
                                a = a + 1
                            elif row['Priority'] == 'P2':
                                b = b + 1
                            elif row['Priority'] == 'P3':
                                c = c + 1
                            elif row['Priority'] == 'P4':
                                d = d + 1
                            elif row['Priority'] == 'P5':
                                e = e + 1
            total = a + b + c + d + e
            ps1.append(a / total)
            ps2.append(b / total)
            ps3.append(c / total)
            ps4.append(d / total)
            ps5.append(e / total)

        if i == 'svc':
            for rootpath, dirpath, filepath in os.walk('../JDK_data'):
                for ifile in filepath:
                    path = os.path.join(rootpath, ifile)
                    df = pd.read_csv(path)

                    for index, row in df.iterrows():
                        if row['Component/s'] == 'hotspot' and (
                                ('1a7ea3f0' in str(row['Custom field (Subcomponent)'])) or (
                                '22ed5982' in str(row['Custom field (Subcomponent)'])) or (
                                        '326b62a5' in str(row['Custom field (Subcomponent)'])) or (
                                        '391247c' in str(row['Custom field (Subcomponent)'])) or (
                                        '45a85b32' in str(row['Custom field (Subcomponent)'])) or (
                                        '4fe221f' in str(row['Custom field (Subcomponent)']))):
                            if row['Priority'] == 'P1':
                                a = a + 1
                            elif row['Priority'] == 'P2':
                                b = b + 1
                            elif row['Priority'] == 'P3':
                                c = c + 1
                            elif row['Priority'] == 'P4':
                                d = d + 1
                            elif row['Priority'] == 'P5':
                                e = e + 1
            total = a + b + c + d + e
            ps1.append(a / total)
            ps2.append(b / total)
            ps3.append(c / total)
            ps4.append(d / total)
            ps5.append(e / total)

        if i == 'other':
            for rootpath, dirpath, filepath in os.walk('../JDK_data'):
                for ifile in filepath:
                    path = os.path.join(rootpath, ifile)
                    df = pd.read_csv(path)

                    for index, row in df.iterrows():
                        if row['Component/s'] == 'hotspot' and (
                                ('45f33599' in str(row['Custom field (Subcomponent)'])) or (
                                '495fd1b8' in str(row['Custom field (Subcomponent)'])) or (
                                        '1f43f15b' in str(row['Custom field (Subcomponent)'])) or (
                                        '5718f51f' in str(row['Custom field (Subcomponent)'])) or (
                                        '447ce8b4' in str(row['Custom field (Subcomponent)']))):
                            if row['Priority'] == 'P1':
                                a = a + 1
                            elif row['Priority'] == 'P2':
                                b = b + 1
                            elif row['Priority'] == 'P3':
                                c = c + 1
                            elif row['Priority'] == 'P4':
                                d = d + 1
                            elif row['Priority'] == 'P5':
                                e = e + 1
            total = a + b + c + d + e
            ps1.append(a / total)
            ps2.append(b / total)
            ps3.append(c / total)
            ps4.append(d / total)
            ps5.append(e / total)

    print(ps1, ps2, ps3, ps4, ps5)
    '''
    ps1 = [0.0845649516612957, 0.05970975961005871, 0.05951730063266422, 0.040411646586345384, 0.030985915492957747, 0.025682182985553772, 0.015037593984962405, 0.010771992818671455] 
    ps2 = [0.2130236692965885, 0.1758059155865736, 0.18808091853471842, 0.21987951807228914, 0.09577464788732394, 0.1332263242375602, 0.10751879699248121, 0.13913824057450627] 
    ps3 = [0.351927991999111, 0.30962667552896866, 0.3300788877606811, 0.30220883534136544, 0.2563380281690141, 0.420545746388443, 0.3661654135338346, 0.37881508078994613] 
    ps4 = [0.32559173241471273, 0.43425279716406334, 0.39951573849878935, 0.40763052208835343, 0.6056338028169014, 0.40930979133226325, 0.49097744360902257, 0.45691202872531417] 
    ps5 = [0.024891654628292032, 0.02060485211033566, 0.02280715457314692, 0.029869477911646587, 0.011267605633802818, 0.011235955056179775, 0.02030075187969925, 0.01436265709156194]
    '''
    ps11 = np.array(ps1)
    ps22 = np.array(ps2)
    ps33 = np.array(ps3)
    ps44 = np.array(ps4)
    ps55 = np.array(ps5)
    plt.figure(figsize=(5, 2))
    plt.bar(x=ps22 + ps33 + ps44 + ps11, width=ps55, height=0.7, label='P5', bottom=ind, color='#D3D3D3',
            orientation="horizontal")
    plt.bar(x=ps33 + ps22 + ps11, width=ps44, height=0.7, label='P4', bottom=ind, color='#A9A9A9',
            orientation="horizontal")
    plt.bar(x=ps22 + ps11, width=ps33, height=0.7, label='P3', bottom=ind, color='#808080', orientation="horizontal")
    plt.bar(x=ps11, width=ps22, height=0.7, label='P2', bottom=ind, color='#696969', orientation="horizontal")
    plt.bar(x=0, bottom=ind, width=ps11, height=0.7, label='P1', color='#000000', orientation="horizontal")
    # plt.xticks(ind, xbar, rotation=20,horizontalalignment='right',weight='bold',size=11)
    plt.xticks(size=10, weight='bold')
    plt.yticks(ind, xbar, weight='bold', size=10)
    # plt.rcParams.update({weight':'bold'})
    plt.legend(bbox_to_anchor=(1.03, 0), loc=3, borderaxespad=0, prop={'weight': 'bold'})
    plt.gcf().subplots_adjust(left=0.1, right=0.85)
    plt.tight_layout()
    plt.show()


def get_duration():
    comnum = []
    allnum = []
    runtimenum = []
    gcnum = []
    svcnum = []

    day = 0
    for rootpath, dirpath, filepath in os.walk('../JDK_data'):
        for ifile in filepath:
            path = os.path.join(rootpath, ifile)
            df = pd.read_csv(path)
            colnames = df.columns.tolist()

            for index, row in df.iterrows():
                if row['Component/s'] != 'hotspot':
                    continue

                if isinstance(row['Resolved'], str) is False and math.isnan(row['Resolved']):
                    continue

                first = row['Created'].split(' ')[0]
                next = row['Resolved'].split(' ')[0]

                matchobj = re.match('(.+)-(.+)-(.+)', first)
                fy = int(matchobj.group(1))
                fm = int(matchobj.group(2))
                fd = int(matchobj.group(3))

                matchobj = re.match('(.+)-(.+)-(.+)', next)
                ny = int(matchobj.group(1))
                nm = int(matchobj.group(2))
                nd = int(matchobj.group(3))

                if ny == fy:
                    day = (nm - fm) * 30 + nd - fd
                else:
                    day = (ny - fy) * 365 + (nm - fm) * 30 + nd - fd

                allnum.append(day)

                if ('216f1fe7' in str(row['Custom field (Subcomponent)'])) or (
                        '368c800d' in str(row['Custom field (Subcomponent)'])) or (
                        'a4a38a9' in str(row['Custom field (Subcomponent)'])):
                    runtimenum.append(day)
                elif ('5d640af4' in str(row['Custom field (Subcomponent)'])) or (
                        '2e4eb2bc' in str(row['Custom field (Subcomponent)'])) or (
                        '400daccd' in str(row['Custom field (Subcomponent)'])) or (
                        '723b1f03' in str(row['Custom field (Subcomponent)'])):
                    gcnum.append(day)
                elif ('1a7ea3f0' in str(row['Custom field (Subcomponent)'])) or (
                        '22ed5982' in str(row['Custom field (Subcomponent)'])) or (
                        '326b62a5' in str(row['Custom field (Subcomponent)'])) or (
                        '391247c' in str(row['Custom field (Subcomponent)'])) or (
                        '45a85b32' in str(row['Custom field (Subcomponent)'])) or (
                        '4fe221f' in str(row['Custom field (Subcomponent)'])):
                    svcnum.append(day)

    for rootpath, dirpath, filepath in os.walk('../Compiler_data'):
        for ifile in filepath:
            path = os.path.join(rootpath, ifile)
            df = pd.read_csv(path)
            colnames = df.columns.tolist()

            for index, row in df.iterrows():
                if isinstance(row['Resolved'], str) is False and math.isnan(row['Resolved']):
                    continue

                first = row['Created'].split(' ')[0]
                next = row['Resolved'].split(' ')[0]

                matchobj = re.match('(.+)-(.+)-(.+)', first)
                fy = int(matchobj.group(1))
                fm = int(matchobj.group(2))
                fd = int(matchobj.group(3))

                matchobj = re.match('(.+)-(.+)-(.+)', next)
                ny = int(matchobj.group(1))
                nm = int(matchobj.group(2))
                nd = int(matchobj.group(3))

                if ny == fy:
                    day = (nm - fm) * 30 + nd - fd
                else:
                    day = (ny - fy) * 365 + (nm - fm) * 30 + nd - fd

                comnum.append(day)

    print('compiler')
    print(np.mean(comnum))
    SD_P = np.std(comnum)
    n = len(comnum)
    print(SD_P / math.sqrt(n))

    print('runtime')
    print(np.mean(runtimenum))
    SD_P = np.std(runtimenum)
    n = len(runtimenum)
    print(SD_P / math.sqrt(n))

    print('gc')
    print(np.mean(gcnum))
    SD_P = np.std(gcnum)
    n = len(gcnum)
    print(SD_P / math.sqrt(n))

    print('svc')
    print(np.mean(svcnum))
    SD_P = np.std(svcnum)
    n = len(svcnum)
    print(SD_P / math.sqrt(n))

    print('all')
    print(np.mean(allnum))
    SD_P = np.std(allnum)
    n = len(allnum)
    print(SD_P / math.sqrt(n))


def get_comments():
    comnum_comment = []
    allnum_comment = []
    runtimenum_comment = []
    gcnum_comment = []
    svcnum_comment = []
    for rootpath, dirpath, filepath in os.walk('../JDK_data'):
        for ifile in filepath:
            path = os.path.join(rootpath, ifile)
            df = pd.read_csv(path)
            colnames = df.columns.tolist()
            gram_col = []
            for i in colnames:
                if 'Comment' in i:
                    gram_col.append(i)

            for index, row in df.iterrows():
                if row['Component/s'] != 'hotspot':
                    continue
                comment_num = 0
                for i in gram_col:
                    if isinstance(row[i], str) is False and math.isnan(row[i]):
                        pass
                    else:
                        comment_num = comment_num + 1

                allnum_comment.append(comment_num)

                if ('216f1fe7' in str(row['Custom field (Subcomponent)'])) or (
                        '368c800d' in str(row['Custom field (Subcomponent)'])) or (
                        'a4a38a9' in str(row['Custom field (Subcomponent)'])):
                    runtimenum_comment.append(comment_num)
                elif ('5d640af4' in str(row['Custom field (Subcomponent)'])) or (
                        '2e4eb2bc' in str(row['Custom field (Subcomponent)'])) or (
                        '400daccd' in str(row['Custom field (Subcomponent)'])) or (
                        '723b1f03' in str(row['Custom field (Subcomponent)'])):
                    gcnum_comment.append(comment_num)
                elif ('1a7ea3f0' in str(row['Custom field (Subcomponent)'])) or (
                        '22ed5982' in str(row['Custom field (Subcomponent)'])) or (
                        '326b62a5' in str(row['Custom field (Subcomponent)'])) or (
                        '391247c' in str(row['Custom field (Subcomponent)'])) or (
                        '45a85b32' in str(row['Custom field (Subcomponent)'])) or (
                        '4fe221f' in str(row['Custom field (Subcomponent)'])):
                    svcnum_comment.append(comment_num)

    for rootpath, dirpath, filepath in os.walk('../Compiler_data'):
        for ifile in filepath:
            path = os.path.join(rootpath, ifile)
            df = pd.read_csv(path)
            colnames = df.columns.tolist()
            gram_col = []
            for i in colnames:
                if 'Comment' in i:
                    gram_col.append(i)

            for index, row in df.iterrows():
                comment_num = 0
                for i in gram_col:
                    if isinstance(row[i], str) is False and math.isnan(row[i]):
                        pass
                    else:
                        comment_num = comment_num + 1

                comnum_comment.append(comment_num)

    print('compiler')
    print(np.mean(comnum_comment))
    SD_P = np.std(comnum_comment)
    n = len(comnum_comment)
    print(SD_P / math.sqrt(n))

    print('runtime')
    print(np.mean(runtimenum_comment))
    SD_P = np.std(runtimenum_comment)
    n = len(runtimenum_comment)
    print(SD_P / math.sqrt(n))

    print('gc')
    print(np.mean(gcnum_comment))
    SD_P = np.std(gcnum_comment)
    n = len(gcnum_comment)
    print(SD_P / math.sqrt(n))

    print('svc')
    print(np.mean(svcnum_comment))
    SD_P = np.std(svcnum_comment)
    n = len(svcnum_comment)
    print(SD_P / math.sqrt(n))

    print('all')
    print(np.mean(allnum_comment))
    SD_P = np.std(allnum_comment)
    n = len(allnum_comment)
    print(SD_P / math.sqrt(n))


def get_affectversion():
    comnum_affectversion = []
    allnum_affectversion = []
    runtimenum_affectversion = []
    gcnum_affectversion = []
    svcnum_affectversion = []
    for rootpath, dirpath, filepath in os.walk('../JDK_data'):
        for ifile in filepath:
            path = os.path.join(rootpath, ifile)
            df = pd.read_csv(path)
            colnames = df.columns.tolist()
            gram_aff = []
            for i in colnames:
                if 'Affects Version' in i:
                    gram_aff.append(i)

            for index, row in df.iterrows():
                if row['Component/s'] != 'hotspot':
                    continue
                affectversion_num = 0
                for i in gram_aff:
                    if isinstance(row[i], str) is False and math.isnan(row[i]):
                        pass
                    else:
                        affectversion_num = affectversion_num + 1

                allnum_affectversion.append(affectversion_num)

                if ('216f1fe7' in str(row['Custom field (Subcomponent)'])) or (
                        '368c800d' in str(row['Custom field (Subcomponent)'])) or (
                        'a4a38a9' in str(row['Custom field (Subcomponent)'])):
                    runtimenum_affectversion.append(affectversion_num)
                elif ('5d640af4' in str(row['Custom field (Subcomponent)'])) or (
                        '2e4eb2bc' in str(row['Custom field (Subcomponent)'])) or (
                        '400daccd' in str(row['Custom field (Subcomponent)'])) or (
                        '723b1f03' in str(row['Custom field (Subcomponent)'])):
                    gcnum_affectversion.append(affectversion_num)
                elif ('1a7ea3f0' in str(row['Custom field (Subcomponent)'])) or (
                        '22ed5982' in str(row['Custom field (Subcomponent)'])) or (
                        '326b62a5' in str(row['Custom field (Subcomponent)'])) or (
                        '391247c' in str(row['Custom field (Subcomponent)'])) or (
                        '45a85b32' in str(row['Custom field (Subcomponent)'])) or (
                        '4fe221f' in str(row['Custom field (Subcomponent)'])):
                    svcnum_affectversion.append(affectversion_num)

    for rootpath, dirpath, filepath in os.walk('../Compiler_data'):
        for ifile in filepath:
            path = os.path.join(rootpath, ifile)
            df = pd.read_csv(path)
            colnames = df.columns.tolist()
            gram_aff = []
            for i in colnames:
                if 'Affects Version' in i:
                    gram_aff.append(i)

            for index, row in df.iterrows():
                affectversion_num = 0
                for i in gram_aff:
                    if isinstance(row[i], str) is False and math.isnan(row[i]):
                        pass
                    else:
                        affectversion_num = affectversion_num + 1

                comnum_affectversion.append(affectversion_num)

    print('compiler')
    print(np.mean(comnum_affectversion))
    SD_P = np.std(comnum_affectversion)
    n = len(comnum_affectversion)
    print(SD_P / math.sqrt(n))

    print('runtime')
    print(np.mean(runtimenum_affectversion))
    SD_P = np.std(runtimenum_affectversion)
    n = len(runtimenum_affectversion)
    print(SD_P / math.sqrt(n))

    print('gc')
    print(np.mean(gcnum_affectversion))
    SD_P = np.std(gcnum_affectversion)
    n = len(gcnum_affectversion)
    print(SD_P / math.sqrt(n))

    print('svc')
    print(np.mean(svcnum_affectversion))
    SD_P = np.std(svcnum_affectversion)
    n = len(svcnum_affectversion)
    print(SD_P / math.sqrt(n))

    print('all')
    print(np.mean(allnum_affectversion))
    SD_P = np.std(allnum_affectversion)
    n = len(allnum_affectversion)
    print(SD_P / math.sqrt(n))


def get_changed():
    comnum_changed = []
    allnum_changed = []
    runtimenum_changed = []
    gcnum_changed = []
    svcnum_changed = []
    with open('../fixsizedata/comcha.txt', 'r') as f:
        for i in f.readlines():
            comnum_changed.append(int(i.strip('\n')))
    with open('../fixsizedata/runcha.txt', 'r') as f:
        for i in f.readlines():
            runtimenum_changed.append(int(i.strip('\n')))
    with open('../fixsizedata/gccha.txt', 'r') as f:
        for i in f.readlines():
            gcnum_changed.append(int(i.strip('\n')))
    with open('../fixsizedata/svccha.txt', 'r') as f:
        for i in f.readlines():
            svcnum_changed.append(int(i.strip('\n')))
    with open('../fixsizedata/allcha.txt', 'r') as f:
        for i in f.readlines():
            allnum_changed.append(int(i.strip('\n')))

    print('compiler')
    print(np.mean(comnum_changed))
    # print(np.median(comnum_changed))
    # SD_P=np.std(comnum_changed)
    # n=len(comnum_changed)
    # print(SD_P/math.sqrt(n))

    print('runtime')
    print(np.mean(runtimenum_changed))
    # print(np.median(runtimenum_changed))
    # SD_P=np.std(runtimenum_changed)
    # n=len(runtimenum_changed)
    # print(SD_P/math.sqrt(n))

    print('gc')
    print(np.mean(gcnum_changed))
    # print(np.median(gcnum_changed))
    # SD_P=np.std(gcnum_changed)
    # n=len(gcnum_changed)
    # print(SD_P/math.sqrt(n))

    print('svc')
    print(np.mean(svcnum_changed))
    # print(np.median(svcnum_changed))
    # SD_P=np.std(svcnum_changed)
    # n=len(svcnum_changed)
    # print(SD_P/math.sqrt(n))

    print('all')
    print(np.mean(allnum_changed))
    # print(np.median(allnum_changed))
    # SD_P=np.std(allnum_changed)
    # n=len(allnum_changed)
    # print(SD_P/math.sqrt(n))


def get_ins():  # get inserted line number
    comnum_ins = []
    allnum_ins = []
    runtimenum_ins = []
    gcnum_ins = []
    svcnum_ins = []

    with open('../fixsizedata/comins.txt', 'r') as f:
        for i in f.readlines():
            comnum_ins.append(int(i.strip('\n')))
    with open('../fixsizedata/runins.txt', 'r') as f:
        for i in f.readlines():
            runtimenum_ins.append(int(i.strip('\n')))
    with open('../fixsizedata/gcins.txt', 'r') as f:
        for i in f.readlines():
            gcnum_ins.append(int(i.strip('\n')))
    with open('../fixsizedata/svcins.txt', 'r') as f:
        for i in f.readlines():
            svcnum_ins.append(int(i.strip('\n')))
    with open('../fixsizedata/allins.txt', 'r') as f:
        for i in f.readlines():
            allnum_ins.append(int(i.strip('\n')))

    print('compiler')
    print(np.mean(comnum_ins))
    SD_P = np.std(comnum_ins)
    n = len(comnum_ins)
    print(SD_P / math.sqrt(n))

    print('client-libs')
    print(np.mean(runtimenum_ins))
    SD_P = np.std(runtimenum_ins)
    n = len(runtimenum_ins)
    print(SD_P / math.sqrt(n))

    print('hotspot')
    print(np.mean(gcnum_ins))
    SD_P = np.std(gcnum_ins)
    n = len(gcnum_ins)
    print(SD_P / math.sqrt(n))

    print('core-libs')
    print(np.mean(svcnum_ins))
    SD_P = np.std(svcnum_ins)
    n = len(svcnum_ins)
    print(SD_P / math.sqrt(n))

    print('all')
    print(np.mean(allnum_ins))
    SD_P = np.std(allnum_ins)
    n = len(allnum_ins)
    print(SD_P / math.sqrt(n))


def get_del():  # get deleted line number
    comnum_del = []
    allnum_del = []
    runtimenum_del = []
    gcnum_del = []
    svcnum_del = []
    with open('../fixsizedata/comdele.txt', 'r') as f:
        for i in f.readlines():
            comnum_del.append(int(i.strip('\n')))
    with open('../fixsizedata/rundele.txt', 'r') as f:
        for i in f.readlines():
            runtimenum_del.append(int(i.strip('\n')))
    with open('../fixsizedata/gcdele.txt', 'r') as f:
        for i in f.readlines():
            gcnum_del.append(int(i.strip('\n')))
    with open('../fixsizedata/svcdele.txt', 'r') as f:
        for i in f.readlines():
            svcnum_del.append(int(i.strip('\n')))
    with open('../fixsizedata/alldele.txt', 'r') as f:
        for i in f.readlines():
            allnum_del.append(int(i.strip('\n')))

    print('compiler')
    print(np.mean(comnum_del))
    SD_P = np.std(comnum_del)
    n = len(comnum_del)
    print(SD_P / math.sqrt(n))

    print('runtime')
    print(np.mean(runtimenum_del))
    SD_P = np.std(runtimenum_del)
    n = len(runtimenum_del)
    print(SD_P / math.sqrt(n))

    print('gc')
    print(np.mean(gcnum_del))
    SD_P = np.std(gcnum_del)
    n = len(gcnum_del)
    print(SD_P / math.sqrt(n))

    print('svc')
    print(np.mean(svcnum_del))
    SD_P = np.std(svcnum_del)
    n = len(svcnum_del)
    print(SD_P / math.sqrt(n))

    print('all')
    print(np.mean(allnum_del))
    SD_P = np.std(allnum_del)
    n = len(allnum_del)
    print(SD_P / math.sqrt(n))


def get_fix():  # get changed file number
    allnum = 0
    allfix = 0
    runtimenum = 0
    runtimefix = 0
    gcnum = 0
    gcfix = 0
    svcnum = 0
    svcfix = 0
    comnum = 0
    comfix = 0

    for rootpath, dirpath, filepath in os.walk('../JDK_data'):
        for ifile in filepath:
            path = os.path.join(rootpath, ifile)
            df = pd.read_csv(path)

            for index, row in df.iterrows():
                if row['Component/s'] != 'hotspot':
                    continue
                allnum = allnum + 1

                if row['Resolution'] == 'Fixed':
                    allfix = allfix + 1

                if ('216f1fe7' in str(row['Custom field (Subcomponent)'])) or (
                        '368c800d' in str(row['Custom field (Subcomponent)'])) or (
                        'a4a38a9' in str(row['Custom field (Subcomponent)'])):
                    runtimenum = runtimenum + 1
                    if row['Resolution'] == 'Fixed':
                        runtimefix = runtimefix + 1
                elif ('5d640af4' in str(row['Custom field (Subcomponent)'])) or (
                        '2e4eb2bc' in str(row['Custom field (Subcomponent)'])) or (
                        '400daccd' in str(row['Custom field (Subcomponent)'])) or (
                        '723b1f03' in str(row['Custom field (Subcomponent)'])):
                    gcnum = gcnum + 1
                    if row['Resolution'] == 'Fixed':
                        gcfix = gcfix + 1
                elif ('1a7ea3f0' in str(row['Custom field (Subcomponent)'])) or (
                        '22ed5982' in str(row['Custom field (Subcomponent)'])) or (
                        '326b62a5' in str(row['Custom field (Subcomponent)'])) or (
                        '391247c' in str(row['Custom field (Subcomponent)'])) or (
                        '45a85b32' in str(row['Custom field (Subcomponent)'])) or (
                        '4fe221f' in str(row['Custom field (Subcomponent)'])):
                    svcnum = svcnum + 1
                    if row['Resolution'] == 'Fixed':
                        svcfix = svcfix + 1

    for rootpath, dirpath, filepath in os.walk('../Compiler_data'):
        for ifile in filepath:
            path = os.path.join(rootpath, ifile)
            df = pd.read_csv(path)

            for index, row in df.iterrows():
                comnum = comnum + 1
                if row['Resolution'] == 'Fixed':
                    comfix = comfix + 1

    print(allnum, allfix / allnum)
    print(runtimenum, runtimefix / runtimenum)
    print(gcnum, gcfix / gcnum)
    print(svcnum, svcfix / svcnum)
    print(comnum, comfix / comnum)


def get_pd():
    time = 0
    day = 0
    for rootpath, dirpath, filepath in os.walk('../Compiler_data'):
        for ifile in filepath:
            path = os.path.join(rootpath, ifile)
            df = pd.read_csv(path)
            colnames = df.columns.tolist()

            for index, row in df.iterrows():
                if row['Component/s'] != 'hotspot':
                    continue
                if row['Priority'] == 'P1':
                    if isinstance(row['Resolved'], str) is False and math.isnan(row['Resolved']):
                        continue
                    time = time + 1
                    first = row['Created'].split(' ')[0]
                    next = row['Resolved'].split(' ')[0]

                    matchobj = re.match('(.+)-(.+)-(.+)', first)
                    fy = int(matchobj.group(1))
                    fm = int(matchobj.group(2))
                    fd = int(matchobj.group(3))

                    matchobj = re.match('(.+)-(.+)-(.+)', next)
                    ny = int(matchobj.group(1))
                    nm = int(matchobj.group(2))
                    nd = int(matchobj.group(3))

                    if ny == fy:
                        day = day + (nm - fm) * 30 + nd - fd
                    else:
                        day = day + (ny - fy) * 365 + (nm - fm) * 30 + nd - fd

    print(day / time)


def getresolution():
    newdict = {}
    fixeddict = {}
    rejecteddict = {}
    unconfirmdict = {}

    day = []
    num = []
    fixed = []
    rejected = []
    unconfirmed = []
    ticks = []
    for i in range(2000, 2022):
        for j in range(1, 13):
            a = str(i) + '-' + str(j)
            day.append(a)
    day.extend(['2022-1', '2022-2', '2022-3'])

    for i in range(0, len(day), 6):
        ticks.append(day[i])

    for rootpath, dirpath, filepath in os.walk('../Compiler_data'):
        for ifile in filepath:
            path = os.path.join(rootpath, ifile)
            df = pd.read_csv(path)

            for index, row in df.iterrows():
                if row['Component/s'] != 'hotspot':
                    continue
                first = row['Created'].split(' ')[0]

                matchobj = re.match('(.+)-(.+)-(.+)', first)
                fy = int(matchobj.group(1))
                fm = int(matchobj.group(2))
                fd = int(matchobj.group(3))

                time = str(fy) + '-' + str(fm)

                if time in newdict.keys():
                    newdict[time] = newdict[time] + 1
                else:
                    newdict[time] = 1

                if row['Resolution'] == 'Fixed':
                    if time in fixeddict.keys():
                        fixeddict[time] = fixeddict[time] + 1
                    else:
                        fixeddict[time] = 1
                elif row['Resolution'] == 'Duplicate' or row['Resolution'] == 'Won\'t Fix' or row[
                    'Resolution'] == 'Not an Issue' or row['Resolution'] == 'Withdrawn' or row[
                    'Resolution'] == 'Cannot Reproduce' or row['Resolution'] == 'Incomplete' or row[
                    'Resolution'] == 'External' or row['Resolution'] == 'Reject [Challenge]' or row[
                    'Resolution'] == 'Rejected':
                    if time in rejecteddict.keys():
                        rejecteddict[time] = rejecteddict[time] + 1
                    else:
                        rejecteddict[time] = 1
                else:
                    if time in unconfirmdict:
                        unconfirmdict[time] = unconfirmdict[time] + 1
                    else:
                        unconfirmdict[time] = 1

    for i in day:
        if i in newdict.keys():
            num.append(newdict[i])
        else:
            num.append(0)

        if i in fixeddict.keys():
            fixed.append(fixeddict[i])
        else:
            fixed.append(0)

        if i in rejecteddict.keys():
            rejected.append(rejecteddict[i])
        else:
            rejected.append(0)

        if i in unconfirmdict.keys():
            unconfirmed.append(unconfirmdict[i])
        else:
            unconfirmed.append(0)

    plt.plot(day, num)
    plt.plot(day, fixed)
    plt.plot(day, rejected)
    plt.plot(day, unconfirmed)
    plt.grid()
    plt.legend(['new', 'fixed', 'rejected', 'unconfirmed'], loc='0')
    plt.xticks(ticks, rotation=45)
    plt.show()


def get_duplicate():
    comnum = []
    dict1 = {'0': 0, '1': 0, '2': 0, '3': 0, '4': 0, '5': 0, '>=6': 0}
    for rootpath, dirpath, filepath in os.walk('../Compiler_data'):
        for ifile in filepath:
            path = os.path.join(rootpath, ifile)
            df = pd.read_csv(path)
            colnames = df.columns.tolist()

            gram_col = []
            for i in colnames:
                if 'Duplicate' in i:
                    gram_col.append(i)

            for index, row in df.iterrows():
                num = 0
                for i in gram_col:
                    if isinstance(row[i], str) is False and math.isnan(row[i]):
                        pass
                    else:
                        num = num + 1
                comnum.append(num)

    for i in comnum:
        if i < 6:
            dict1[str(i)] += 1
        else:
            dict1['>=6'] += 1

    print(dict1)


def gethelp():
    para = ('   --priorty       get distribution of priorty\n'
            '   --duration      get distribugtion of duration\n'
            '   --resolution    get distribugtion of resolution\n'
            '   --pd            get distribugtion of between priorty and duration day \n'
            '   --duplicate     get distribugtion of duplicate \n'
            '   --fixratio      get distribugtion of fix ratio \n'
            '   --changefile    get distribugtion of changed file number \n'
            '   --deleline      get distribugtion of deleted line number \n'
            '   --insline       get distribugtion of inserted line number \n'
            '   --affectversion get distribugtion of affected versions number \n'
            '   --comment       get distribugtion of comment number \n'
            '   --total         get Trend graph of totalnum and proportion\n')
    print(para)


if __name__ == '__main__':
    if len(sys.argv) < 2:
        arg = ''
    else:
        arg = sys.argv[1]

    if 'priorty' in arg:
        draw_priorty()
    elif 'duration' in arg:
        get_duration()
    elif 'resolution' in arg:
        getresolution()
    elif 'pd' in arg:
        get_pd()
    elif 'duplicate' in arg:
        get_duplicate()
    elif 'fixratio' in arg:
        get_fix()
    elif 'changefile' in arg:
        get_changed()
    elif 'deleline' in arg:
        get_del()
    elif 'insline' in arg:
        get_ins()
    elif 'affectversion' in arg:
        get_affectversion()
    elif 'comment' in arg:
        get_comments()
    elif 'total' in arg:
        num_proportion()
    else:
        gethelp()
