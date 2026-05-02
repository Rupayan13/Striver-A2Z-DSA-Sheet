def print_n_times(msg, n):
    if n == 1:
        print(msg)
        return
    print(msg)
    print_n_times(msg, n - 1)


msg = input("Enter what you want to print: ")
n = int(input("Enter the number of times you want to print: "))

print_n_times(msg, n)
