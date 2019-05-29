
## The number guessing game
from random import randint as rnd
print("LabGuess, 105 Point Version")
print("The Guessing game program")
print("By: Nilo Mackey",end="\n\n")
print("==============================",end="\n\n")
print("Welcome to my guessing game!")
print("Guess a number between 1 and 30",end="\n\n")
num = rnd(1,30)
while(True):
    guessstr = input("What is your guess? ")
    try:
        guess = eval(guessstr)
        if (guess == num):
            print("You guess it! Congratulations!",end="\n\n")
            print("Thank you for playing!")
            exit()
        else:
            print("Sorry, "+str(guess)+" is not it!")
            tagan = input("Do you want to try again?(Y/N)  ")
            if (tagan == 'n' or tagan == 'N'):
                exit()
            if (tagan != 'n' and tagan != 'N' and tagan != 'y' and tagan != 'Y'):
                print("Sorry, I don't understand your input. Please input Y or N. RECIEVED INPUT: " + tagan)
    except NameError:
        print("Please enter a valid integer between 1 and 30")
    print()
        
    
