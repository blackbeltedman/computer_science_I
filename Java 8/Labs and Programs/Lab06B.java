

import java.awt.*;
import java.applet.*;
import java.lang.Math;



public class Lab06B extends Applet
{
 Font font = new Font("Dialog", Font.PLAIN, 150);
 public void paint(Graphics g)
 {
      // Substitute your own name here.
      Expo.drawHeading(g,"Nilo Mackey","6B");
      g.setFont(font);
  // DRAW CUBE
      Expo.drawRectangle(g, 300, 300, 100, 100);
      Expo.drawRectangle(g, 375, 375, 175, 175);
      Expo.drawLine(g, 300, 300, 375, 375);
      Expo.drawLine(g, 100, 100, 175, 175);
      Expo.drawLine(g, 300, 100, 375, 175);
      Expo.drawLine(g, 100, 300, 175, 375);
      
  // DRAW TARGET
      Expo.setColor(g, Expo.black);
      Expo.fillCircle(g, 750, 225, 130);
      Expo.setColor(g, Expo.white);
      Expo.fillCircle(g, 750, 225, 105);
      Expo.setColor(g, Expo.blue);
      Expo.fillCircle(g, 750, 225, 80);
      Expo.setColor(g, Expo.red);
      Expo.fillCircle(g, 750, 225, 55);
      Expo.setColor(g, Expo.yellow);
      Expo.fillCircle(g, 750, 225, 30);
      Expo.setColor(g, Expo.black);

  // DRAW TRIANGLE
      Expo.drawPolygon(g, 800, 500, 875, 700, 725, 700);
      Expo.drawLine(g, 800, 500, 800, 700);
      Expo.drawLine(g, 875, 700, (800-Math.round(75/2)), 600);
      Expo.drawLine(g, 725, 700, (800+Math.round(75/2)), 600);

  // DRAW FACE
      Expo.drawOval(g, 500, 600, 100, 150);
      Expo.drawPoint(g, 450, 550);
      Expo.drawPoint(g, 550, 550);
      Expo.drawOval(g, 450, 550, 30, 20);
      Expo.drawOval(g, 550, 550, 30, 20);
      Expo.drawOval(g, 500, 650, 80, 30);

  // DRAW NM
      Expo.drawString(g, "NM", 75, 700);





 }

}

