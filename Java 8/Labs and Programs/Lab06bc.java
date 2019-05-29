
import static java.lang.System.*;

public class Lab06bc
{
  public static String sameAs(String a, String b){
    boolean temp = a.equals(b);
    if (temp == true){
      return (a + " has the same letters as " + b);
    }
    else{
      return (a + " does not have the same letters as " + b);
    }
  }
  
  public static String isBefore(String a, String b){
    char fcharA = a.charAt(0);
    char fcharB = b.charAt(0);
    if ((fcharA > fcharB) || (a.compareTo(b) > b.compareTo(a))) {
      return (a + " should be placed after " + b);
    }
    else if ((fcharA < fcharB) || (a.compareTo(b) < b.compareTo(a))) {
      return (a + " should be placed before " + b);
    }
    if (fcharA == fcharB) {
      return (a + " is equal to " + b);
    }
    else{
      return ("ERROR");
    }
  }
 public static void main( String args[] )
 {
  String word1 = "one";
  String word2 = "two";
  String word3 = "three";
  String word4 = "four";
  String word5 = "abe";
  String word6 = "ape";
  String word7 = "State";
  String word8 = "Champions";
  String word9 = "ABC";
  String word10 = "ABC";
  String word11 = "ABC";
  String word12 = "CBA";
  String word13 = "Same";
  String word14 = "Same";
  String word15 = "fun";
  String word16 = "funny";
  
  System.out.println(sameAs(word1, word2));
  System.out.println(isBefore(word1, word2));
  System.out.println();
  
  System.out.println(sameAs(word3, word4));
  System.out.println(isBefore(word3, word4));
  System.out.println();
  
  System.out.println(sameAs(word5, word6));
  System.out.println(isBefore(word5, word6));
  System.out.println();
  
  System.out.println(sameAs(word7, word8));
  System.out.println(isBefore(word7, word8));
  System.out.println();
  
  System.out.println(sameAs(word9, word10));
  System.out.println(isBefore(word9, word10));
  System.out.println();
  
  System.out.println(sameAs(word11, word12));
  System.out.println(isBefore(word11, word12));
  System.out.println();
  
  System.out.println(sameAs(word13, word14));
  System.out.println(isBefore(word13, word14));
  System.out.println();
  
  System.out.println(sameAs(word15, word16));
  System.out.println(isBefore(word15, word16));
  System.out.println();
 }
}