row = int(input("Enter the number of rows: "))

for i in range(1, row + 1):
    for j in range(i, 0, -1):
        print(chr(65 + row - j), end=" ")
    print()
