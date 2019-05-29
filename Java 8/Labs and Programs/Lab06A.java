
public class Lab06A
{
 public static Double cAr(int radius){
   Double area = Math.PI*(radius*radius);
   return area;
 }
 public static void main(String args[])
 {
   System.out.println("Lab 06A, 110 Point Version");
   System.out.println();
   System.out.println("Arithmetic with Math Class Methods");
   System.out.println();
   System.out.println("By: Nilo Mackey");  // Substitute your own name here.
   System.out.println("\n==================================\n");
   
   double w = 10.0;
   double x = 5.0;
   double y = 77.77;
   double z = 1.21;
   
   double s1 = Math.sqrt(25);
   double s2 = Math.sqrt(100);
   double s3 = Math.sqrt(3);
   double s4 = Math.sqrt(x);
   double s5 = Math.sqrt(y);
   double s6 = Math.sqrt(x+y);
   double s7 = Math.sqrt(x*y);
   
   double a1 = Math.abs(7);
   double a2 = Math.abs(-7);
   double a3 = Math.abs(w);
   double a4 = Math.abs(-1*x);
   double a5 = Math.abs(z-y);
   double a6 = Math.abs(y-z);
   
   double p1 = Math.pow(7,2);
   double p2 = Math.pow(2,7);
   double p3 = Math.pow(z,3);
   double p4 = Math.pow(3,z);
   double p5 = Math.pow(w,x);
   double p6 = Math.pow(x,w);
   double p7 = Math.pow((-1*x),2);
   double p8 = Math.pow(w,-1);
   double p9 = Math.pow(w,-2);
   
   double r1 = Math.round(2.0001);
   double r2 = Math.round(2.4999);
   double r3 = Math.round(2.5);
   double r4 = Math.round(2.9999);
   
   double c1 = cAr(1);
   double c2 = cAr(5);
   double c3 = cAr(10);
   double c4 = cAr(50);
   double c5 = cAr(100);
   double c6 = -1*(Math.abs(Math.PI));
   double c7 = Math.sqrt(Math.abs(-65536));
   double c8 = Math.sqrt(Math.sqrt(65536));
   double c9 = Math.sqrt(Math.sqrt(Math.sqrt(65536)));
   double c10 = Math.sqrt(Math.sqrt(Math.sqrt(Math.sqrt(65536))));
   
   

   
   System.out.println("s1 = " + s1);
   System.out.println("s2 = " + s2);
   System.out.println("s3 = " + s3);
   System.out.println("s4 = " + s4);
   System.out.println("s5 = " + s5);
   System.out.println("s6 = " + s6);
   System.out.println("s7 = " + s7);
   System.out.println();
   
   System.out.println("a1 = " + a1);
   System.out.println("a2 = " + a2);
   System.out.println("a3 = " + a3);
   System.out.println("a4 = " + a4);
   System.out.println("a5 = " + a5);
   System.out.println("a6 = " + a6);
   System.out.println();
   
   System.out.println("p1 = " + p1);
   System.out.println("p2 = " + p2);
   System.out.println("p3 = " + p3);
   System.out.println("p4 = " + p4);
   System.out.println("p5 = " + p5);
   System.out.println("p6 = " + p6);
   System.out.println("p7 = " + p7);
   System.out.println("p8 = " + p8);
   System.out.println("p9 = " + p9);
   System.out.println();
   
   System.out.println("r1 = " + r1);
   System.out.println("r2 = " + r2);
   System.out.println("r3 = " + r3);
   System.out.println("r4 = " + r4);
   System.out.println();
   
   System.out.println("c1 = " + c1);
   System.out.println("c2 = " + c2);
   System.out.println("c3 = " + c3);
   System.out.println("c4 = " + c4);
   System.out.println("c5 = " + c5);
   System.out.println("c6 = " + c6);
   System.out.println("c7 = " + c7);
   System.out.println("c8 = " + c8);
   System.out.println("c9 = " + c9);
   System.out.println("c10 = " + c10);






   System.out.println();
 }
}