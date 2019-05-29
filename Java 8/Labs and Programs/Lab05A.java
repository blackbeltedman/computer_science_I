// Lab05A.java
// Arithmetic with PEMDAS

public class Lab05A
{
 public static void main(String args[])
 {
  double r = 10.0;
  double x = 5.0;
  double y = 77.77;
  double z = 1.21;
  final double PI = 3.14159;

  //define all a1 - p2
  double a1 = 2 * (x + 1);
  double a2 = 2*x + 2*1;
  double b1 = 3*(r+x);
  double b2 = (3*r)+(3*x);
  double c1 = r*(x+y);
  double c2 = (r*x)+(r*y);
  double d1 = 5*(y-7.77);
  double d2 = (5*y)-(5*7.77);
  double e1 = z*(y-r);
  double e2 = z*y - z*r;
  double f1 = r*(x + y + z);
  double f2 = r*x + r*y + r*z;
  double g1 = r + x*y + z;
  double g2 = (r + x)*(y + z);
  double h1 = r - x*y - z;
  double h2 = (r - x)*(y - z);
  double j1 = r*(x/y)*z;
  double j2 = (r*x)/(y*z);
  double k1 = r-(x/y)-z;
  double k2 = (r-x)/(y-z);
  double m1 = (1.0/2.0);
  double m2 = (3.0/7.0);
  double n1 = (2*(r+x))/5;
  double n2 = (2*r)+(x/5);
  double p1 = 2*PI*r;
  double p2 = PI*r*r; 
    
  System.out.println("Lab 05A, 100 Point Version");
  System.out.println();
  System.out.println("Arithmetic with PEMDAS");
  System.out.println();
  System.out.println("By: Nilo Mackey");  // Substitute your own name here.
  System.out.println("\n===========================\n");
  System.out.println();
  System.out.println();
  System.out.println("a1 = " + a1);
  System.out.println("a2 = " + a2);
  System.out.println();
  System.out.println("b1 = " + b1);
  System.out.println("b2 = " + b2);
  System.out.println();
  System.out.println("c1 = " + c1);
  System.out.println("c2 = " + c2);
  System.out.println();
  System.out.println("d1 = " + d1);
  System.out.println("d2 = " + d2);
  System.out.println();
  System.out.println("e1 = " + e1);
  System.out.println("e2 = " + e2);
  System.out.println();
  System.out.println("f1 = " + f1);
  System.out.println("f2 = " + f2);
  System.out.println();
  System.out.println("g1 = " + g1);
  System.out.println("g2 = " + g2);
  System.out.println();
  System.out.println("h1 = " + h1);
  System.out.println("h2 = " + h2);
  System.out.println();
  System.out.println("j1 = " + j1);
  System.out.println("j2 = " + j2);
  System.out.println();
  System.out.println("k1 = " + k1);
  System.out.println("k2 = " + k2);
  System.out.println();
  System.out.println("m1 = " + m1);
  System.out.println("m2 = " + m2);
  System.out.println();
  System.out.println("n1 = " + n1);
  System.out.println("n2 = " + n2);
  System.out.println();
  System.out.println("p1 = " + p1);
  System.out.println("p2 = " + p2);
 }
}


