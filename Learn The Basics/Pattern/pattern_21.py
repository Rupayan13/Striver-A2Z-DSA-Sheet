row = int(input("Enter the number of rows: "))

for i in range(1, row + 1):
    if i == 1 or i == row:
        for j in range(1, row + 1):
            print("*", end="")
    else:
        print("*", end="")
        for s in range(row - 2):
            print(" ", end="")
        print("*", end="")
    print()
