
import static java.lang.System.*;

public class Lab04ab
{
 public static void main ( String[] args )
 {
  String word1 = "Hello";
  String word2 = "World";
  String word3 = "JukeBox";
  String word4 = "Money";
  String word5 = "UIL";
  String word6 = "Contest";
  String sum;
  int len;
  char firstLetter;
  char lastLetter;
  
  firstLetter = word1.charAt(0);
  len = word1.length();
  lastLetter = word1.charAt(len-1);
  System.out.println("word1 :: "+word1);
  System.out.println("first letter :: "+firstLetter);
  System.out.println("last letter :: "+lastLetter);
  System.out.println();
  firstLetter = word2.charAt(0);
  len = word2.length();
  lastLetter = word2.charAt(len-1);
  System.out.println("word2 :: "+word2);
  System.out.println("first letter :: "+firstLetter);
  System.out.println("last letter :: "+lastLetter);
  System.out.println();
  sum = word1+" "+word2;
  System.out.println("sum :: "+sum);
  System.out.println();
  firstLetter = word3.charAt(0);
  len = word3.length();
  lastLetter = word3.charAt(len-1);
  System.out.println("word3 :: "+word3);
  System.out.println("first letter :: "+firstLetter);
  System.out.println("last letter :: "+lastLetter);
  System.out.println();
  firstLetter = word4.charAt(0);
  len = word4.length();
  lastLetter = word4.charAt(len-1);
  System.out.println("word4 :: "+word4);
  System.out.println("first letter :: "+firstLetter);
  System.out.println("last letter :: "+lastLetter);
  System.out.println();
  sum = word3+" "+word4;
  System.out.println("sum :: "+sum);
  System.out.println();
  firstLetter = word5.charAt(0);
  len = word5.length();
  lastLetter = word5.charAt(len-1);
  System.out.println("word5 :: "+word5);
  System.out.println("first letter :: "+firstLetter);
  System.out.println("last letter :: "+lastLetter);
  System.out.println();
  firstLetter = word6.charAt(0);
  len = word6.length();
  lastLetter = word6.charAt(len-1);
  System.out.println("word6 :: "+word6);
  System.out.println("first letter :: "+firstLetter);
  System.out.println("last letter :: "+lastLetter);
  System.out.println();
  sum = word5+" "+word6;
  System.out.println("sum :: "+sum);
  System.out.println();
 }
}