
# The ODD or EVEN program

print("Lab 06B, 100 Point Version")
print("The ODD or EVEN Program")
print("By: Nilo Mackey")
print()
print("==============================")
print()
answer = "Y"
while(answer == "Y"):
    num = int(input("Enter an integer number : "))
    if (num%2 == 0):
        print(str(num) + "  is even")
    else:
        print(str(num) + "  is odd")
    answer = input("Would you like to run the program again? (Y/N): ")
