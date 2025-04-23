# name1 = "raju"
# name2 = "pani"
# flames = ["Friends", "Lovers", "Affectionate", "Marriage", "Enemies", "Siblings"]
# for i in name1:
#     if i in name2:
#         name1 = name1.replace(i, "")
#         name2 = name2.replace(i, "")

# totalLength = len(name1) + len(name2)
# index = 0
# while(len(flames) > 1):
#     index = (index + (totalLength -1)) % len(flames)
#     flames.pop(index)

# print(flames[0])
# def pattern_print(row):
#     num = 1
#     for i in range(1,row+1):
#         row = []
#         for j in range(i):
#             row.append(num)
#             num += 1
#         if i % 2 == 0:
#             row.reverse()
#         print("*".join(str(x) for x in row))
# pattern_print(15)

import time
import os
h,m,s = 0,0,0

while(1):
   

    time.sleep(1)
    os.system("clear")
    s += 1
    if s == 60:
        s=0
        m+=1
    elif(m==60):
        s=0
        m=0
        h += 1
    elif(h==12):
        s=0
        m=0
        h=0
    print(f"{h} : {m} : {s}")
    
