import random
def isValid(matrix: list[list[int]]) -> bool:
    outer_sum = 0
    outer_sum += sum(matrix[0])
    outer_sum += sum(matrix[-1])


    for i in range(1,len(matrix)-1):
        outer_sum += matrix[i][0]
        outer_sum += matrix[i][-1]
    total_sum = 0
    for i in range(len(matrix)):
        total_sum += sum(matrix[i])
    inner = total_sum - outer
    return outer == inner

outer=0
inner = 1
while(inner != outer):
    n,m = 3,3
    grid = [[random.randint(1,10) for _ in range(n)] for i in range(m)]
    
    if(isValid(grid)):
        for i in grid:
            for elem in i:
                print(elem, end = " ")
            print()
        break

