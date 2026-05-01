"""
age = int(input("Enter your age: "))

if age >= 18:
    print("You are an adult.")
else:
    print("You are a minor.")
"""

marks = int(input("enter your marks: "))
if marks < 25:
    print("Grade: F")
elif marks >= 25 and marks <= 44:
    print("Grade: E")
elif marks >= 45 and marks <= 49:
    print("Grade: D")
elif marks >= 50 and marks <= 59:
    print("Grade: C")
elif marks >= 60 and marks <= 69:
    print("Grade: B")
elif marks >= 70:
    print("Grade: A")
else:
    print("Invalid marks entered.")
