# The Geometry functions program


# global variables

side = 7.0
length = 5.0
width = 6.0
radius = 10.0
pi = 3.14159

# function definitions

def heading():
    print()
    print("***************************************")
    print("LAB 03D, THE GEOMETRY FUNCTIONS PROGRAM")
    print("100 POINT VERSION")
    print("BY NILO MACKEY")
    print("***************************************")
    print()

def squarePerimeter():
    perim=side*4
    print("Square Perimeter:           ",perim)

def hexagonPerimeter():
    perim=side*6
    print("Hexagon Perimeter:          ",perim)

def rectanglePerimeter():
    perim=(length+width)*2
    print("Rectangle Perimeter:        ",perim)

def circleCircumference():
    circum=2*pi*radius
    print("Circle Circumference:       ",circum)

def squareArea():
    area=side**2
    print("Square Area:                ",area)

def rectangleArea():
    area=length*width
    print("Rectangle Area:             ",area)

def circleArea():
    area=pi*(radius**2)
    print("Circle Area:                ",area)

def cubeSurfaceArea():
    sa=6*(side**2)
    print("Cube Surface Area:          ",sa)

def sphereSurfaceArea():
    sa=4*pi*(radius**2)
    print("Sphere Surface Area:        ",sa)

def cubeVolume():
    vol=side**3
    print("Cube Volume:                ",vol)

def sphereVolume():
    vol=(4*pi*(radius**3))/3
    print("Sphere Volume:              ",vol)

# program execution / function calls
heading()
squarePerimeter()
hexagonPerimeter()
rectanglePerimeter()
circleCircumference()
squareArea()
rectangleArea()
circleArea()
cubeSurfaceArea()
sphereSurfaceArea()
cubeVolume()
sphereVolume()


