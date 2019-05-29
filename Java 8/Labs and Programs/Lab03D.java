public class Lab03D
{
 
 public static void main( String[] args )
   {
   Cube myCube = new Cube(112);
   myCube.calculateSurfaceArea();
   System.out.println(myCube);
  
   Cube myCube2 = new Cube(4);
   myCube2.calculateSurfaceArea();
   System.out.println(myCube2);
   
   Cube myCube3 = new Cube(33);
   myCube3.calculateSurfaceArea();
   System.out.println(myCube3);
  
   Cube myCube4 = new Cube(50);
   myCube4.calculateSurfaceArea();
   System.out.println(myCube4);
   
   Cube myCube5 = new Cube(5);
   myCube5.calculateSurfaceArea();
   System.out.println(myCube5);
  
   Cube myCube6 = new Cube(19);
   myCube6.calculateSurfaceArea();
   System.out.println(myCube6);
 }
}

class Cube
{
 int side;
 int surf;
 String output;
 public Cube(int s)
 {
  side = s;
 }

 public void calculateSurfaceArea()
 {
  surf = ((side*side)*6);
 }

 public String toString( )
 {
  output = ("The surface area is :: " + surf + "\n");
  
  return output;
 }
}