
import static java.lang.System.*;
import java.util.Arrays;

public class Lab04d
{
  public static String chopUp (String str1){
    String chopped = "";
    int maxIndex = (str1.length());
    for(int i=0;i<maxIndex;i++){
      
      if(str1.charAt(i) == ' '){
        chopped = chopped + "\n";
      }
      else{
        chopped = chopped + str1.charAt(i);
      }
    }
    
    return (chopped);
  }
 public static void main ( String[] args )
 {
  String name1 = "Sally Baker";
  String name2 = "John Doe";
  String name3 = "Sammy Lammy";
  String name4 = "Carolina Coder";
  String name5 = "Pamela Painter";

  System.out.println(chopUp(name1));
  System.out.println(name1);
  System.out.println();
 
  System.out.println(chopUp(name2));
  System.out.println(name2);
  System.out.println();
  
  System.out.println(chopUp(name3));
  System.out.println(name3);
  System.out.println();
  
  System.out.println(chopUp(name4));
  System.out.println(name4);
  System.out.println();
  
  System.out.println(chopUp(name5));
  System.out.println(name5);
  System.out.println();
 }
}