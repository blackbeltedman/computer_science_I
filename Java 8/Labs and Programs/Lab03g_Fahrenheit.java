
import java.lang.*;

public class Lab03g_Fahrenheit
{
 public static void main( String[] args )
   {
   Fahrenheit fahr = new Fahrenheit();
   fahr.setFahrenheit(98.6);
   //fahr.calcCelsius();
   //fahr.getCelsius();
   System.out.println(fahr.toString());

   fahr.setFahrenheit(52.3);
   //fahr.calcCelsius();
   //fahr.getCelsius();
   System.out.println(fahr);
   
   fahr.setFahrenheit(82.45);
   //fahr.calcCelsius();
   //fahr.getCelsius();
   System.out.println(fahr);

   fahr.setFahrenheit(75);
   //fahr.calcCelsius();
   //fahr.getCelsius();
   System.out.println(fahr);
   
   fahr.setFahrenheit(100);
  // fahr.calcCelsius();
  // fahr.getCelsius();
   System.out.println(fahr);
 }
}

class Fahrenheit
{
 //private attributes
  private double f;
  private double c;
  
public Fahrenheit()
{  //default values
 f=0;
 c=0;
}
 
 public void setFahrenheit(double fahren)
 {  //set the values
  f=fahren;
 }

 public void calcCelsius()
 {  //calculate the value
  c = ((f-32)*5/9);
 }
 
 public double getCelsius()
 {  //return the value
  calcCelsius();
  return (Math.round(c));
 }

 public String toString()
 {  //put what you want to print
  String output=(f+" degrees Fahrenheit == "+getCelsius()+" degrees Celsius\n");
  return output;
 }
}