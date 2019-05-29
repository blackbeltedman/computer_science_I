
import java.awt.*;
import java.applet.*;

public class Lab06C extends Applet
{
 public void paint(Graphics g)
 {
      // Substitute your own name here.
      Expo.drawHeading(g,"Nilo Mackey","6C");
      Expo.setColor(g, Expo.black);
      
      //pentagon
      Expo.drawPolygon(g, 200, 300, 300, 375, 275, 450, 125, 450, 100, 375);
      
      //spell "EXPO"
      //E
      Expo.fillPolygon(g, 100, 100, 150, 100, 150, 115, 115, 115, 115, 130, 130, 130, 130, 145, 115, 145, 115, 160, 150, 160, 150, 175, 115, 175, 100, 175);
      //X
      Expo.fillPolygon(g, 165, 100, 180, 100, 180, 130, 195, 130, 195, 100, 210, 100, 210, 130, 195, 130, 195, 145, 210, 145, 210, 175, 195, 175, 195, 145, 180, 145, 180, 175, 165, 175, 165, 145, 180, 145, 180, 130, 165, 130);
      //P
      Expo.fillPolygon(g, 225, 100, 275, 100, 275, 145, 240, 145, 240, 175, 225, 175);
      Expo.setColor(g, Expo.white);
      Expo.fillRectangle(g, 240, 115, 255, 130);
      Expo.setColor(g, Expo.black);
      //O
      Expo.fillCircle(g, 330, 140, 40);
      Expo.setColor(g, Expo.white);
      Expo.fillCircle(g, 330, 140, 20);
      Expo.setColor(g, Expo.black);
      
      //draw inscribed things
      Expo.drawCircle(g, 200, 600, 100);
      Expo.drawPolygon(g, 100, 600, 200, 700, 296, 575);
      Expo.drawCircle(g, 197, 633, 45);
      
      //draw snowman
      Expo.drawCircle(g, 450, 650, 50);
      Expo.drawCircle(g, 450, 555, 45);
      Expo.drawCircle(g, 450, 470, 40);
      Expo.drawPoint(g, 450, 585);
      Expo.drawPoint(g, 450, 570);
      Expo.drawPoint(g, 450, 555);
      Expo.drawPoint(g, 450, 540);
      Expo.drawPoint(g, 450, 525);
      Expo.drawPoint(g, 440, 460);
      Expo.drawPoint(g, 460, 460);
      Expo.drawLine(g, 435, 480, 465, 480);
      Expo.drawLine(g, 405, 555, 375, 530);
      Expo.drawLine(g, 495, 555, 525, 530);
      Expo.fillPolygon(g, 490, 430, 410, 430, 410, 415, 425, 415, 425, 370, 470, 370, 470, 415, 490, 415);
      
      //draw flag
      Expo.setColor(g, Expo.blue);
      Expo.fillRectangle(g, 550, 425, 625, 600);
      Expo.setColor(g, Expo.red);
      Expo.fillRectangle(g, 625, 600, 850, 512);
      Expo.setColor(g, Expo.black);
      Expo.drawRectangle(g, 850, 512, 625, 425);

      
 }
}