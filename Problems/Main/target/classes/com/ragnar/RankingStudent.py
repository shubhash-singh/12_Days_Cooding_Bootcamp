a = [
    {"name":"raju", "age":23, "mark":[45,50,40,60]},
    {"name":"rose", "age":12, "mark":[75,85,80,90]},
    {"name":"ravi", "age":53, "mark":[65,70,60,80]},
    {"name":"raju", "age":22, "mark":[55,75,65,70]}
]
def percentage(person):
    return sum(person["mark"])/ len(person["mark"])

i = 0
position = ["First","Second", "Third", "Forth"]

sorted_list = sorted(a, key=percentage, reverse=True)

for person in sorted_list:
    print(f"{person["name"]} has scored {percentage(person)} -> stands {position[i]}")
    i+=1