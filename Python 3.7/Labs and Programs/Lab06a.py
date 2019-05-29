
# The speeding ticket program

colorRed = "\033[91m"
colorEnd = "\033[0m"

print("Lab 06A, 100 POINT VERSION")
print("The Speeding Ticket Program")
print("By: Nilo Mackey")
print()
print("==============================")
print()
start = 75
speedLimit = int(input("What is the posted speed limit?  --> "))
speed = int(input("How fast was the car travelling in mph?  --> "))
schoolZoneInp = input("Did the violation occur in a school zone?  (Y/N)  --> ")
over = speed - speedLimit
if over >= 30:
    penal = 160
else:
    penal = 0
ticket = start + (6*over) + penal
if schoolZoneInp == "y" or schoolZoneInp == "Y":
    ticket *= 2
if ticket == 81:
    print("My sympathies. How ridiculous!")
print("Ticket amount: $ ", ticket)
