
##  The ATM Program   ##

import time
  
loDebitCardNbr = 4444333322221111
hiDebitCardNbr = 4444333322229999
bankBalance = 0
dailyLimit = 0
debitCard = 0
storedPin = 1234
enteredPin = 0
withdrawal = 0

bankBalance = eval(input("Enter Bank Balance ==> "))
dailyLimit = eval(input("Enter Daily Limit ==> "))
debitCard = eval(input("Enter Debit Card Number ==> "))
valDeb = (debitCard >= loDebitCardNbr and debitCard <= hiDebitCardNbr)
while(not(valDeb)):
    print("Invalid Debit Card")
    debitCard = eval(input("Enter Debit Card Number ==> "))
    valDeb = (debitCard >= loDebitCardNbr and debitCard <= hiDebitCardNbr)

print("Valid Debit Card")
pinAttempts = 0
pin = eval(input("Enter PIN "))
valPin = (pin == storedPin)
while(not(valPin) and pinAttempts < 2):
    print("Invalid PIN")
    pinAttempts += 1
    pin = eval(input("Enter PIN "))
    valPin = (pin == storedPin)
    if(pinAttempts == 2):
        print("You have exceeded the 3-try limit.\nYour account is locked.\nPlease contact a bank officer.")
        exit()
print("Valid Pin")
withAmt = eval(input("Enter the withdrawl amount "))
if(withAmt > dailyLimit or withAmt > bankBalance):
    print("Transaction Canceled\nYou have insufficient balance or have exceeded daily limit")
    exit()
print("Printing Receipt")
time.sleep(3)
print("Please take your cash")
    
