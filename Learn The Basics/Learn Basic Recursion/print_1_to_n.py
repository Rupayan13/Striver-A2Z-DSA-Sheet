def print_1_to_n(n):
    if n == 1:
        print(n)
        return
    print_1_to_n(n - 1)
    print(n)


num = int(input("Enter the number :"))
print_1_to_n(num)
