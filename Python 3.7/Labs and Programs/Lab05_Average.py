
# Te visible average program

from math import *

print()
print("***************************************")
print("The Visible Average Program")
print("By NILO MACKEY")
print("***************************************")
print()

period = input("Which period is this for? ")
grade1 = eval(input("Enter grade 1:: "))
grade2 = eval(input("Enter grade 2:: "))
grade3 = eval(input("Enter grade 3:: "))
grade4 = eval(input("Enter grade 4:: "))
grade5 = eval(input("Enter grade 5:: "))
total = (grade1+grade2+grade3+grade4+grade5)
average = (total)/5
roundedAverage = round(average)
print()
print("Grades and average for period:   " + period)
print("1st grade:   ", grade1)
print("2nd grade:   ", grade2)
print("3rd grade:   ", grade3)
print("4th grade:   ", grade4)
print("5th grade:   ", grade5)
print("--------------------")
print("Total:      ", total)
print("Average:    ", average)
print("Rounded:    ", roundedAverage)
