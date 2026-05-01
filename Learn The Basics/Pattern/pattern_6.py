row = int(input("Enter the number of rows: "))

for i in range(row + 1, 1, -1):
    for j in range(i-1):
        print(j + 1, end="")
    print()
