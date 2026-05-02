def prime(num):
    count = 0
    for i in range(1, num + 1):
        if num % i == 0:
            count += 1
    if count == 2:
        return True
    return False


def opt_prime(num):
    count = 0
    for i in range(1, num // 2 + 1):
        if num % i == 0:
            count += 1
            if i != (num // i):
                count += 1
    return count == 2


num = int(input("Enter the number: "))
if opt_prime(num):
    print(f"{num} is a prime number.")
else:
    print(f"{num} is not a prime number.")
