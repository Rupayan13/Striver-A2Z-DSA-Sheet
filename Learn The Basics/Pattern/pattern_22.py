n = int(input("Enter the value of n: "))
size = 2 * n - 1
center = n - 1

for i in range(size):
    for j in range(size):
        value = max(abs(i - center), abs(j - center)) + 1
        print(value, end=" ")
    print()
