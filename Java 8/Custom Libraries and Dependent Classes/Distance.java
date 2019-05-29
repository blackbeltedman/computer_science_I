//� A+ Computer Science  -  www.apluscompsci.com
//Name -nilo mackey
//Date -5/13/19
//Class -7
//Lab  -05a

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
 private int xOne,yOne,xTwo,yTwo;
 private double distance;
 
 public Distance()
 {
   xOne = 0;
   yOne = 0;
   xTwo = 0;
   yTwo = 0;
   distance=0;
 }

 public Distance(int x1, int y1, int x2, int y2)
 {
   xOne = x1;
   yOne = y1;
   xTwo = x2;
   yTwo = y2;
 }

 public void setCoordinates(int x1, int y1, int x2, int y2)
 {
   xOne = x1;
   yOne = y1;
   xTwo = x2;
   yTwo = y2;
 }

 public void calcDistance()
 {
   distance = (Math.sqrt( ( (xTwo-xOne)*(xTwo-xOne) ) + ( (yTwo-yOne)*(yTwo-yOne)) ) );
 }

 public String toString()
 {
   String output = ("distance == " + distance + "\n");
   return output;
 }
}