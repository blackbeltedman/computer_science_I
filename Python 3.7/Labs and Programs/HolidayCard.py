# Christmas Tree Challenge - www.101computing.net/christmas-tree/




colors = ["yellow", "gold", "blue", "purple", "violet", "green", "coral", "orange", "cyan", "black", "white", "grey", "magenta", "slateblue", "orchid", "salmon", "gold", "aliceblue"]

from turtle import *
import random
import turtle
turtle.speed(0)
hideturtle()

def draw_circle(color, x, y, radius):
  turtle.penup()
  turtle.color(color)
  turtle.fillcolor(color)
  turtle.goto(x,y)
  turtle.pendown()
  turtle.begin_fill()
  turtle.circle(radius)
  turtle.end_fill()
    
def draw_triangle(color, x, y, size):
  turtle.penup()
  turtle.color(color)
  turtle.fillcolor(color)
  turtle.goto(x,y)
  turtle.pendown()
  turtle.begin_fill()
  for i in range (3):
    turtle.forward(size)
    turtle.left(120)
  turtle.end_fill()
  turtle.setheading(0)
    
def draw_square(color, x, y, size):
  turtle.penup()
  turtle.color(color)
  turtle.fillcolor(color)
  turtle.goto(x,y)
  turtle.pendown()
  turtle.begin_fill()
  for i in range (4):
    turtle.forward(size)
    turtle.left(90)
  turtle.end_fill()
  turtle.setheading(0)
  
def draw_rectangle(color, x, y, width, height):
  turtle.penup()
  turtle.color(color)
  turtle.fillcolor(color)
  turtle.goto(x,y)
  turtle.pendown()
  turtle.begin_fill()
  for i in range (2):
    turtle.forward(width)
    turtle.left(90)
    turtle.forward(height)
    turtle.left(90)
    
  turtle.end_fill()
  turtle.setheading(0)  
  
def draw_star(color, x, y, size):
  turtle.penup()
  turtle.color(color)
  turtle.fillcolor(color)
  turtle.goto(x,y)
  turtle.pendown()
  turtle.begin_fill()
  turtle.right(144)
  for i in range(5):
    turtle.forward(size)
    turtle.right(144)
    turtle.forward(size)
  turtle.end_fill()
  turtle.setheading(0)

############main program############
turtle.bgcolor(random.choice(colors))
draw_circle("#69D9FF", 0, -200, 200)
draw_triangle(random.choice(colors), -125, -100, random.randint(250,270))
for i in range(26):
    draw_circle(random.choice(colors), -125+(10*i), -110, 19)
    penup()
    turtle.fd(100)
    pendown()
draw_circle(random.choice(colors), 5, 110, 26)
    
x=input("Press enter to end")
exit()
