from turtle import *
from math import *
from random import *
import random
import time

screensize(10000, 10000)
bgcolor('black')
boolrand = ['true', 'false']
colors = ['coral', 'red', 'yellow', 'lavender', 'grey', 'cyan', 'magenta', 'cornflowerblue', 'hotpink']
speed(0)
hideturtle()
color('black')
def sqr(sidelen):
    rpt = 0
    while(rpt <= 4):
        fd(sidelen)
        rt(90)
        rpt = rpt + 1
    rpt = 0

def bfl():
    begin_fill()

def efl():
    end_fill()

def pnu():
    penup()

def pnd():
    pendown()

color('white')
rt(-90)
sqr(20)
fd(60)
sqr(20)
pnu()
rt(45)
fd(14.1421)
pnd()
bfl()
circle(2)
efl()
rt(45)
pnu()
fd(60)
pnd()
bfl()
circle(2)
efl()
pnu()
rt(45)
fd(14.1421)
pnd()
color('peachpuff')
right(135)
width(2)
fd(80)
rt(90)
fd(40)
rt(90)
fd(80)
rt(90)
fd(40)
pnu()
rt(130)
fd(50)
pnd()
left(30)
color('white')
fd(8)
rt(180)
fd(8)
pnu()
fd(80)
pnd()
bfl()
pnu()
rt(90)
fd(100)
pnd()
time.sleep(5)
clear()
color('blue')
circle(randint(1, 20))
while(1):
    if(random.choice(boolrand) == 'true'):
        bfl()
    else:
        efl()
    color(random.choice(colors))
    pnu()
    rt(randint(20, 280))
    fd(randint(30, 100))
    pnd()
    circle(randint(1, 90))
    pnu()
    left(randint(20, 280))
    fd(randint(30, 100))
    pnd()
    #circle(randint(1, 90))
    circle(sin(randint(30,90)))
    efl()
