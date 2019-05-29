
import java.awt.*;
import java.applet.*;


public class Lab08A extends Applet
{

 public void paint(Graphics g)
 {
   // Substitute your own name here.
   Expo.drawHeading(g,"*********","8A");
      
   // DRAW horizontal Circles
   for (int i = 100; i<=700; i=i+50){
     Expo.drawCircle(g, i, 100, 40);
   }

   // DRAW diagonal Circles
   for (int i = 100; i<=450; i=i+20){
     Expo.drawCircle(g, i, i, 40);
   }
   

}

}