from turtle import *
import random
from random import randint
colors = ['gold', 'white', 'yellow', 'blue', 'red', 'moccasin', 'mediumspringgreen', 'teal', 'crimson', 'thistle', 'coral', 'olive', 'lightslategrey','dimgrey', 'cyan', 'wheat', 'khaki']
x = 70
y = 0
repeattimes = 75
widthh = 1.5
hideturtle()
screensize(100000,100000)
width(widthh)
#speed('fastest')
bgcolor('black')
color('white')
begin_fill()
circle(10)
end_fill()
forward(100)
tracer(0,0)
while(y <= repeattimes):
    while(y <= repeattimes):
        left(x)
        forward(40)
        color(random.choice(colors))
        right(x)
        forward(40)
        color(random.choice(colors))
        left(x)
        forward(40)
        color(random.choice(colors))
        right(x)
        forward(40)
        color(random.choice(colors))
        right(2*x)
        forward(80)
        x = x - 0.005
        y = y + 1
        #bgcolor(random.choice(colors))
        update()
        
    y = 0
    x= x + 5
    right(randint(0, 15))
    forward(220)
    
    while(y <=repeattimes):
        left(x)
        forward(40)
        color(random.choice(colors))
        right(x)
        forward(40)
        color(random.choice(colors))
        left(x)
        forward(40)
        color(random.choice(colors))
        right(x)
        forward(40)
        color(random.choice(colors))
        right(2*x)
        x = x - 0.005
        y = y + 1
        update()
        #bgcolor(random.choice(colors))
    y = 0
    update()
