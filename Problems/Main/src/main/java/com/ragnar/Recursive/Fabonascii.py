
def generateFibanascii(n :int):
    if n <= 1:
        return [1]
    if n == 2:
        return [1,1]

    list1 = generateFibanascii(n-1)
    list1.append(list1[-1] + list1[-2])
    return list1

print(*generateFibanascii(10))