import math

num = int(input("Enter a number: "))

"""
count = 0
while num > 0:
    count += 1
    num //= 10
print("Number of digits:", count)
"""

# Optimal approach
count = int(math.log10(num)) + 1
print("Number of digits:", count)
