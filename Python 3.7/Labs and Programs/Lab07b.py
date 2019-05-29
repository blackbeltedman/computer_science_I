
## FireworkFlowers

## NOTE: SCROLL AROUND! THE PROGRAM DRAWS SOME AT STRANGE LOCATIONS!
## THIS IS PART OF THE BEAUTY OF THE PROGRAM!

from time import *
from turtle import *
from random import *
screensize(5000,5000)
colormode(255)
speed(0)
width(2)
hideturtle()

def randColor():
    randR = randint(0,255)
    randG = randint(0,255)
    randB = randint(0,255)
    return randR,randG,randB

def designOne():
    x=0
    while(x<=2):
        x=0
        while(x<=255):
            color(x, 0, 0)
            fd(x/2)
            lt(45+(x/6))
            x+=1
        x=0
        penup()
        fd(300)
        pendown()
        while(x<=255):
            color(0, x, 0)
            fd(x/2)
            lt(45+(x/6))
            x+=1
        x=0
        penup()
        rt(25)
        fd(300)
        pendown()
        while(x<=255):
            color(0, 0, x)
            fd(x/2)
            lt(45+(x/6))
            x+=1
        x+=1
        penup()
        fd(300)
        pendown()
        while(x<=255):
            color(x, x, 0)
            fd(x/2)
            lt(45+(x/6))
            x+=1
        x=0
        penup()
        fd(300)
        pendown()
        while(x<=255):
            color(0, x, x)
            fd(x/2)
            lt(45+(x/6))
            x+=1
        x=0
        penup()
        rt(25)
        fd(300)
        pendown()
        while(x<=255):
            color(x, x, x)
            fd(x/2)
            lt(45+(x/6))
            x+=1
        x+=1
        penup()
        fd(300)
        pendown()
    x+=1

y=0      
def designTwo():
    y=0
    while(y<=2):
        x=255
        while(x<=255):
            color(x, 0, 0)
            fd(x/2)
            lt(45+(x/6))
            x-=1
        x=255
        penup()
        fd(300)
        pendown()
        while(x<=255):
            color(0, x, 0)
            fd(x/2)
            lt(45+(x/6))
            x-=1
        x=255
        penup()
        rt(25)
        fd(300)
        pendown()
        while(x<=255):
            color(0, 0, x)
            fd(x/2)
            lt(45+(x/6))
            x-=1
        x=255
        penup()
        fd(300)
        pendown()
        while(x<=255):
            color(x, x, 0)
            fd(x/2)
            lt(45+(x/6))
            x-=1
        x=255
        penup()
        fd(300)
        pendown()
        while(x<=255):
            color(0, x, x)
            fd(x/2)
            lt(45+(x/6))
            x+=1
        x=255
        penup()
        rt(25)
        fd(300)
        pendown()
        while(x<=255):
            color(x, x, x)
            fd(x/2)
            lt(45+(x/6))
            x+=1
        x=255
        penup()
        fd(300)
        pendown()
    y+=1

def transition():
    time.sleep(5)
    clearscreen()
    penup()
    goto(0,0)
    pendown()

designOne()
transition()
designTwo()
update()
done()
