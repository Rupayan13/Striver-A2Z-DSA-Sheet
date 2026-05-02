def reverse(num):
    rev = 0
    while num > 0:
        rev = rev * 10 + num % 10
        num //= 10
    return rev


num = int(input("Enter a number: "))
if num == reverse(num):
    print(f"The number {num} is a palindrome.")
else:
    print(f"The number {num} is not a palindrome.")
