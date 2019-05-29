
public class Lab05B
{
 public static void main(String args[])
 {
  System.out.println("Lab 05B, 100 Point Version");
       System.out.println();
       System.out.println("The Visible Average Program");
       System.out.println();
       System.out.println("By: Nilo Mackey");
       System.out.println("\n===========================\n");

       int num1 = 11;
       int num2 = 22;
       int num3 = 33;
       int num4 = 44;
       int num5 = 55;
       int total = (num1+num2+num3+num4+num5);
       int average = (total/5);
       
       System.out.println("1st integer:  "+num1);
       System.out.println("2nd integer:  "+num2);
       System.out.println("3rd integer:  "+num3);
       System.out.println("4th integer:  "+num4);
       System.out.println("5th integer:  "+num5);
       System.out.println("-------------------");
       System.out.println("Int Total:    "+total);
       System.out.println("Int Average:  "+average);
       
       double rnum1 = 55.55;
       double rnum2 = 66.66;
       double rnum3 = 77.77;
       double rnum4 = 88.88;
       double rnum5 = 99.99;
       double rtotal = (rnum1+rnum2+rnum3+rnum4+rnum5);
       double raverage = (rtotal/5);
       
       System.out.println();
       System.out.println();
       System.out.println("1st real num:  "+rnum1);
       System.out.println("2nd real num:  "+rnum2);
       System.out.println("3rd real num:  "+rnum3);
       System.out.println("4th real num:  "+rnum4);
       System.out.println("5th real num:  "+rnum5);
       System.out.println("-------------------");
       System.out.println("Real Total:    "+rtotal);
       System.out.println("Real Average:  "+raverage);
 }
}