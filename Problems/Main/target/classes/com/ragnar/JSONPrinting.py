# data = {
#     1: {"name":"Shubhash Singh", "age":21, "cgpa":7.2, "gender":"MALE"},
#     2: {"name":"Dikshya Singh", "age":20, "cgpa":7.2, "gender":"FEMALE"},
#     3: {"name":"Nisha Pandey", "age":19, "cgpa":7.2, "gender":"FEMALE"},
#     4: {"name":"Aashish Sah", "age":22, "cgpa":7.2, "gender":"MALE"},
#     5: {"name":"Ritikesh Kumar", "age":20, "cgpa":7.2, "gender":"MALE"}
# }

# print("-"*70)
# print("{:<5} | {:20} | {:<5} | {:<8} | {:<10} | ".format("ID","NAME","AGE","CGPA","GENDER"))
# print("-"*70)
# for id, student in data.items():
#     print("{:<5} | {:20} | {:<5} | {:<8} | {:<10} |".format(id, student["name"], student["age"], student["cgpa"], student["gender"]))
# print("-"*70)

# import calendar
# year = int(input())
# print(calendar.calendar(year))

# birthday = 2002-11-08
from datetime import datetime

birth_date = datetime(2002, 11, 8)

current_date = datetime.now()
days_difference = (current_date - birth_date).days

print(f"Number of days from birthday to current date: {days_difference}")
