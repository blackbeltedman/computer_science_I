## List with Menu

shoppingList = []
## put defs here for 105
def readlist():
    print()
    print("Reading Shopping List")
    print()
    file = open("MyList.txt","r")
    for i in file:
        shoppingList.append(i)
    file.close()
    print()
    print("Done!")
    print()
def printlist():
    print()
    print("Shopping List")
    print()
    if(shoppingList == []):
        print("Your shopping list is empty!")
    for item in shoppingList:
        print(item, end="")
    print()
def addlist():
    inp = input("Please enter an item for your list: ")
    shoppingList.append(inp + "\n")
def savelist():
    print()
    print("Saving...")
    print()
    file = open("MyList.txt","w")
    file.write("")
    file.close()
    file = open("MyList.txt","a")
    l = []
    for i in shoppingList:
        y = i + "\n"
        l.append(y)
    for f in range(len(l)):
        file.write(l[f])
    file.close()
    print("Saved!")
    print()

##empty list
shoppingList = []

## read MyList.txt and put lines into the empty list


##start loop for the menu
##MENU OPTIONS: Print the List, Add to the list, Save the list, Quit
x = 0
while(x!=5):
    print("MENU")
    print("1. Read the list")
    print("2. Print the list")
    print("3. Add to the list")
    print("4. Save the list")
    print("5. Quit")
    x = eval(input("What would you like to do?  "))
    if(x==1):
        readlist()
    elif(x==2):
        printlist()
    elif(x==3):
        addlist()
    elif(x==4):
        savelist()
    elif(x==5):
        break
    else:
        print("INVALID NUMBER")
    print()
## all done!
print()
print("Good-bye!")

