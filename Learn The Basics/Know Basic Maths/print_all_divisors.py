import math


def get_divisors(num):
    res = []
    for i in range(1, num + 1):
        if num % i == 0:
            res.append(i)
    return res


def opt_get_divisors(num):
    res = []
    for i in range(1, math.isqrt(num) + 1):
        if num % i == 0:
            res.append(i)
            if i != (num // i):
                res.append(num // i)
    return res


num = int(input("Enter the number: "))
result = opt_get_divisors(num)
print("Divisors of", num, ":", *result)
