
import java.awt.*;
import java.applet.*;

public class Lab07B extends Applet
{
 public void paint(Graphics g)
 {
      // Substitute your own name here.
      Expo.drawHeading(g,"************","7B");   
   
  // Draw Grid
  Expo.drawLine(g,250,50,250,650);
  Expo.drawLine(g,500,50,500,650);
  Expo.drawLine(g,750,50,750,650);
  Expo.drawLine(g,0,350,1000,350);

  int x1, y1, x2, y2, x, y, r;

  // Draw Red Horizontal Lines
  Expo.setColor(g,Expo.red);
  x1 = 0;
  y1 = 55;
  x2 = 250;
  y2 = 55;
  for (int k = 1; k <= 30; k++)
  {
      Expo.drawLine(g,x1,y1,x2,y2);
      y1 += 10;
      y2 += 10;
  }


  // Draw Blue Vertical Lines
  Expo.setColor(g, Expo.blue);
  x1 = 250;
  y1 = 50;
  x2 = 250;
  y2 = 350;
  for (int k = 1; k <= 26; k++)
  {
      Expo.drawLine(g,x1,y1,x2,y2);
      x1 += 10;
      x2 += 10;
  }

  // Draw Magenta Diagonal Dots
  Expo.setColor(g, Expo.magenta);
  x1=500;
  y1=325;
  for (int k = 1; k <= 26; k++)
  {
      Expo.drawPoint(g,x1,y1);
      x1 += 10;
      y1 -= 10;
  }

  // Draw Green Concentric Circles
  Expo.setColor(g, Expo.green);
  x1=875;
  y1=210;
  r=10;
  for (int k = 1; k <= 15; k++)
  {
    Expo.drawCircle(g, x1, y1, r);
    r += 8;
  }

  // Draw Purple Concentric Ovals
  Expo.setColor(g,Expo.purple);
  x1=125;
  y1=500;
  x2=115;
  y2=120;
  for (int k = 1; k <= 20; k++)
  {
    Expo.drawOval(g,x1,y1,x2,y2); 
    x2 -= 10;
    y2 -= 7;
  }
  
  // Draw your name in big, bold, black, italicized letters 10 times
  Expo.setColor(g,Expo.black);
  Font myFont = new Font("Courier",Font.BOLD+Font.ITALIC,20);
  g.setFont(myFont);
  x1=275;
  y1=375;
  for (int k = 1; k <= 10; k++)
  {
    Expo.drawString(g,"Nilo Mackey",x1,y1);
    x1 -= 0;
    y1 += 28;
  }
  
  // Draw Brown Concentric Rectangles
  Expo.setColor(g,Expo.brown);
  x1=620;
  y1=480;
  x2=630;
  y2=520;
  for (int k = 1; k <= 12; k++)
  {
    Expo.drawRectangle(g,x1,y1,x2,y2);
    x1 -= 9;
    y1 -= 10;
    x2 += 9;
    y2 += 10;
  }
  
  // Draw Gold Sphere

 
 }
}


