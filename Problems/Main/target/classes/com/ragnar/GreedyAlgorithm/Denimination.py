def result(deno, n):
    for coin in deno:
        while n >= coin:
            print(coin, end=' ')
            n -= coin

deno = [500, 200, 100, 50, 20, 10, 5, 2, 1]
result(deno, 1500)