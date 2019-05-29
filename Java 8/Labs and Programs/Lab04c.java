
import static java.lang.System.*;

public class Lab04c
{
 public static void main ( String[] args )
 {
  String String1 = "chicken";
  String String2 = "alligator";
  String String3 = "COMPUTER SCIENCE IS THE BEST!";
  String String4 = "I like fried chicken and mashed potatoes!";

 //printlns using substring
  System.out.println(String1.substring(3,6));
  System.out.println(String1);
  System.out.println();
  
  System.out.println(String2.substring(3,8));
  System.out.println(String2);
  System.out.println();
  
  System.out.println(String3.substring(9,12));
  System.out.println(String3.substring(0,12));
  System.out.println(String3.substring(5,20));
  System.out.println(String3);
  System.out.println();
  
  System.out.println(String4.substring(0,7));
  System.out.println(String4.substring(7,15));
  System.out.println(String4.substring(15,26));
  System.out.println(String4.substring(22,26));
  System.out.println(String4);
  System.out.println();
 }
}