import java.awt.*;
import java.applet.*;


public class BS_Paint extends Applet
{
 int xc, yc, xCoord, yCoord;
 boolean ready;
 public Color clr;

 public void paint(Graphics g)
 {
   Expo.setColor(g, Expo.black);
   init.title(g);
   init.colorBoxes(g);

     if(ready){
         Expo.setColor(g, clr);
         Expo.drawPoint(g, xc, yc);
     }
   
 }
 
 public void checkMouseClick(){
   if ((xCoord >= 10  && xCoord <= 40) && (yCoord <= 40 && yCoord >= 10)){
     clr=(Expo.red);
   }
   
   else if ((xCoord >= 50 && xCoord <= 80) && (yCoord <= 40 && yCoord >= 10)){
     clr=(Expo.orange);
   }
   
   else if ((xCoord >= 90 && xCoord <= 120) && (yCoord <= 40 && yCoord >= 10)){
     clr=(Expo.yellow);
   }
   
   else if ((xCoord >= 130 && xCoord <= 160) && (yCoord <= 40 && yCoord >= 10)){
     clr=(Expo.blue);
   }
   
   else if ((xCoord >= 170 && xCoord <= 200) && (yCoord <= 40 && yCoord >= 10)){
     clr=(Expo.green);
   }
   
   else if ((xCoord >= 210 && xCoord <= 240) && (yCoord <= 40 && yCoord >= 10)){
     clr=(Expo.indigo);
   }
   
   else if ((xCoord >= 250 && xCoord <= 280) && (yCoord <= 40 && yCoord >= 10)){
     clr=(Expo.violet);
   }
   
   else if ((xCoord >= 290 && xCoord <= 320) && (yCoord <= 40 && yCoord >= 10)){
     clr=(Expo.black);
   }
   
   else if ((xCoord >= 330 && xCoord <= 360) && (yCoord <= 40 && yCoord >= 10)){
     clr=(Expo.white);
   }
   
   else{}
 }
 
 public boolean mouseDrag(Event e, int x, int y)
 {
  xc = x;
  yc = y;
  repaint();
  return true;
 }
 
 public boolean mouseDown(Event e, int x, int y)
 {
  ready = true;
  xCoord = x;
  yCoord = y;
  repaint();
  return true;
 }
 
 public void update(Graphics g)   
 {   
  checkMouseClick();
  paint(g);
 }
 
}

