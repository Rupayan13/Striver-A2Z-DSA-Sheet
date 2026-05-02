# Brute Force Approach
def bfa_gcd(num1, num2):
    gcd = 1
    for i in range(1, min(num1, num2) + 1):
        if num1 % i == 0 and num2 % i == 0:
            gcd = i
    return gcd


# Better Approach
def bet_gcd(num1, num2):
    for i in range(min(num1, num2), 0, -1):
        if num1 % i == 0 and num2 % i == 0:
            return i
    return 1


# Optimal Approach
def opt_gcd(num1, num2):
    while num1 > 0 and num2 > 0:
        if num1 > num2:
            num1 = num1 % num2
        else:
            num2 = num2 % num1
    if num1 == 0:
        return num2
    return num1


num1 = int(input("Enter the first number :"))
num2 = int(input("Enter the second number :"))

print(bfa_gcd(num1, num2))
print(bet_gcd(num1, num2))
print(opt_gcd(num1, num2))
