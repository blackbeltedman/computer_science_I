
import static java.lang.System.*;
import java.util.Scanner;

public class Lab05mu
{
 public static void main( String args[] )
 {
   while(true){
     double origbill;
     double bill;
     Scanner keyboard = new Scanner(System.in);
     System.out.print("Enter the original bill amount :: ");
     origbill = keyboard.nextDouble();
     if(origbill>2000.0){
       bill = 0.85*origbill;
       System.out.printf("Bill after discount :: %.2f", bill);
     }
     else{
       bill = origbill;
       System.out.printf("Bill after discount :: %.2f", bill);
     }
     System.out.println("\n");
   }
  

 }
}