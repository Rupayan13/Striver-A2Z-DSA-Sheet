row = int(input("Enter the number of rows: "))

for i in range(1, row + 1):
    for s in range(row - i):
        print(" ", end="")
    for j in range(i):
        print(chr(65 + j), end="")
    for k in range(i - 1, 0, -1):
        print(chr(65 + k - 1), end="")
    print()
