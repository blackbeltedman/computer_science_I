
file = open("MyList.txt","rw")

print("Shopping List")
print("this program stores your shopping list and then displays it")

#empty list
shoppingList = []
for i in file:
    shoppingList.append(i)
#display list
print()
print("Shopping List")
print()
for item in shoppingList:
    print(item)
