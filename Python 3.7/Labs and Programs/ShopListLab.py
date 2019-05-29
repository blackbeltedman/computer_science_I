
print("Shopping List")
print("This program stores your shopping list and then displays it")
print()
#empty list
shoppingList=[]

finished = False
while not(finished):
##Code to ask for shopping items and add to the list
    inp=input("Please enter an item for your list: ")
    if(inp == "done"):
        finished=True ##fix this to only happen when they type "done"
    else:
        shoppingList.append(inp)
        
#display list
        
print()
print("Shopping List")
print()

#for loop here

for i in range(len(shoppingList)):
    print(str(shoppingList[i]))

