row = int(input("Enter the number of rows: "))

for i in range(1, row + 1):
    for j in range(row - i + 1, 0, -1):
        print("*", end="")
    for s in range(2 * i - 1):
        print(" ", end="")
    for k in range(row - i + 1, 0, -1):
        print("*", end="")
    print()


for i in range(row, 0, -1):
    for j in range(row - i + 1, 0, -1):
        print("*", end="")
    for s in range(2 * i - 1):
        print(" ", end="")
    for k in range(row - i + 1, 0, -1):
        print("*", end="")
    print()
