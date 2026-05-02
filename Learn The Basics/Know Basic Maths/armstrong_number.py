import math


def armstrong(num):
    power = num_of_digits(num)
    actual_number = num
    res = 0
    while num > 0:
        res += (num % 10) ** power
        num //= 10
    return res == actual_number


def num_of_digits(num):
    return int(math.log10(num) + 1)


num = int(input("Enter the number :"))
if armstrong(num):
    print(f"{num} is a armstrong number.")
else:
    print(f"{num} is not a armstrong number.")
