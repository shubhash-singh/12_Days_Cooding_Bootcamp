def getTotalPosibility(num:int):
    seq = {}
    def abc(x):
        if x in seq:
            return seq[x]
        if x == 0:
            return 0
        if x == 1:
            return 1
        if x == 2:
            return 2
        seq[x] = abc(x-1) + abc(x-3)
        return seq[x]
    return abc(num)
print(getTotalPosibility(4))