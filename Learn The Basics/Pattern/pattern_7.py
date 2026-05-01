row = int(input("Enter the number of rows: "))

for i in range(row):
    for s in range(row - i -1):
        print(" ", end="")
    for j in range(0, 2 * i + 1):
        print("*", end="")
    print()
