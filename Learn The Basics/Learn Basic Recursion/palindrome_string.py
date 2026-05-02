# Iterative approach
def is_palindrome(s):
    left = 0
    right = len(s) - 1
    while left < right:
        if s[left] != s[right]:
            return False
        left += 1
        right -= 1
    return True


# Recursive approach
def is_palindrome_recursive(s, left, right):
    if left >= right:
        return True
    if s[left] != s[right]:
        return False
    return is_palindrome_recursive(s, left + 1, right - 1)


s = input("Enter a string: ")
print("Is the string a palindrome?", is_palindrome(s))
print(
    "Is the string a palindrome (recursive)?", is_palindrome_recursive(s, 0, len(s) - 1)
)
