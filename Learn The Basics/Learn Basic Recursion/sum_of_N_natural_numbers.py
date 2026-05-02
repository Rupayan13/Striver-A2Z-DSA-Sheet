def sum_of_natural_numbers(n):
    if n == 1:
        return 1
    return n + sum_of_natural_numbers(n - 1)


num = int(input("Enter the number :"))
print("The sum of first", num, "natural numbers is:", sum_of_natural_numbers(num))
