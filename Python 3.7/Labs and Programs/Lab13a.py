
##Lab  - File Odd or Even
try:
    file = open("lab13a.dat","r")
    for x in file:
        y=int(x)
        if(y%2==0):
            print(str(y) + " is even.", end="\n")
        elif(y%2==1):
            print(str(y) + " is odd.", end="\n")
        else:
            print("INVALID CHARACTER READ")
            quit()
finally:
    file.close()
