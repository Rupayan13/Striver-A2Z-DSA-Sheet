row = int(input("Enter the number of rows: "))

for i in range(1, row + 1):
    for j in range(1, i + 1):
        print(j, end="")
    for s in range(1, 2 * (row - i) + 1):
        print(" ", end="")
    for k in range(i, 0, -1):
        print(k, end="")
    print()
