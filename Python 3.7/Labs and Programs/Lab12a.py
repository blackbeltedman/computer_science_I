
# Function <isPal> returns true if <str> is a "palindrome" 
# and false otherwise.
charset = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']

def isPal(str1):
    l = len(str1)
    pal = ""
    for i in range(l):
        temp = (i + 1)
        str2 = str1[l - temp]
        pal += str2
    if(str1 == pal):
        return True
    else:
        return False
 
#
# Function <isLetter> returns true if <char> is a letter 
# in the ['A'..'Z'] range and false otherwise.
def isLetter(char):
    if(char in charset):
        return True
#
#
# Function <purge> returns <str> with all non-apha-numeric 
# characters removed.
def purge(str1):
    strL = str1.lower()
    strC = ""
    l = len(strL)
    for i in range(l):
        if(isLetter(strL[i])):
            strC += strL[i]
    return strC
#
# Function <isAlmostPal> returns true if str is an "almost palindrome"
# and false otherwise.
def isAlmostPal(str1):
    if isPal(str1):
        return False
    strP = purge(str1)
    l = len(strP)
    pal = ""
    for i in range(l):
        temp = (i + 1)
        str2 = strP[l - temp]
        pal += str2
    if(strP == pal):
        return True
    else:
        return False
    
#
###############################
# Start of main execution loop
notFinished = True
while(notFinished):
   str1 =  input("Enter String ")
   print()
   #
   print("Entered String:          ",str1)
   print("Palindrome?:             ",isPal(str1))   
   print("Almost Palindrome?:      ",isAlmostPal(str1))
   print()
   repeat = input("Do you wish to repeat this program [Y/N]? ")
   notFinished = repeat == "Y"
   print()
#
print("FINISHED")
