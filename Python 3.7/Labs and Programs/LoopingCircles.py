
## The looping program using turtle graphics and circles

from turtle import *

speed(0)

print()
print("Looping Circles")
print("by Nilo Mackey")
color("blue")
#for loop for horizontal circles
for i in range(15):
    circle(30)
    penup()
    forward(30)
    pendown()

goto(0,0)
color("red")
circle(30)
right(45)
#for loop for diagonal circles
x=0
while(x<=14):
    circle(30)
    penup()
    forward(35)
    pendown()
    x+=1
