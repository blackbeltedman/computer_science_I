
import static java.lang.System.*;

public class Lab08b
{
 public static void main ( String[] args )
 {
   int s=2;
   int st=90;
   int in=5;
   System.out.println("start " + s + " : stop "+ st + ": increment " +in);
   for (int i=s; i<=st; i=i+in){
     System.out.print(i + " ");   
   }
   System.out.println();
   System.out.println();
   
   s=3;
   st=76;
   in=4;
   System.out.println("start " + s + " : stop "+ st + ": increment " +in);
   for (int i=s; i<=st; i=i+in){
     System.out.print(i + " ");   
   }
   System.out.println();
   System.out.println();
   
   s=-10;
   st=8;
   in=2;
   System.out.println("start " + s + " : stop "+ st + ": increment " +in);
   for (int i=s; i<st; i=i+in){
     System.out.print(i + " ");   
   }
   System.out.println();
   System.out.println();
   
   s=5;
   st=30;
   in=2;
   System.out.println("start " + s + " : stop "+ st + ": increment " +in);
   for (int i=s; i<=st; i=i+in){
     System.out.print(i + " ");   
   }
   System.out.println();
   System.out.println();
   
   s=100;
   st=150;
   in=5;
   System.out.println("start " + s + " : stop "+ st + ": increment " +in);
   for (int i=s; i<st; i=i+in){
     System.out.print(i + " ");   
   }
   System.out.println();
   System.out.println();
 }
}