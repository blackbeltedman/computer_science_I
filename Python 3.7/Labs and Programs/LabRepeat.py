
## The repeating word program

print("LabRepeat, 105 Point Version")
print("The Repeating Word Program")
print("By: Nilo Mackey")
print()
print("===============================")
print()
word = input("What word do you want to repeat? ")
times = eval(input("How many times would you like to repeat it? "))
print()
times += 1
for i in range (1,times):
    print(i, end = "   ")
    print(word)
print("Finished.")
