# Brute Force Approach
def rev_an_array(arr):
    n = len(arr)
    ans = [0] * n
    for i in range(n):
        ans[i] = arr[n - i - 1]
    return ans


# Better Approach
def rev_an_array_batter(arr):
    p1 = 0
    p2 = len(arr) - 1
    while p1 < p2:
        arr[p1], arr[p2] = arr[p2], arr[p1]
        p1 += 1
        p2 -= 1


# Built In Approach
def rev_an_array_builtin(arr):
    arr[:] = arr[::-1]


arr = [1, 2, 3, 4, 5]
print("Original Array:", arr)
# rev_an_array_builtin(arr)
arr = rev_an_array(arr)
print("Reversed Array:", arr)
