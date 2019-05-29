import java.awt.*;
import java.applet.*;

public class init
{
  private static int cS = 650;
  
  public static void title(Graphics g){
   Expo.drawRectangle(g, 640, 1, 840, 45);
   Expo.setFont(g, "serif", Font.PLAIN, 50);
   Expo.setColor(g, Expo.red);
   Expo.drawString(g, "B", cS, 40);
   Expo.setColor(g, 214, 203, 0);
   Expo.drawString(g, "S", cS+30, 40);
   Expo.setColor(g, Expo.orange);
   Expo.drawString(g, " ", cS+50, 40);
   Expo.setColor(g, Expo.green);
   Expo.drawString(g, "P", cS+75, 40);
   Expo.setColor(g, Expo.blue);
   Expo.drawString(g, "a", cS+103, 40);
   Expo.setColor(g, Expo.indigo);
   Expo.drawString(g, "i", cS+125, 40);
   Expo.setColor(g, Expo.violet);
   Expo.drawString(g, "n", cS+138, 40);
   Expo.setColor(g, Expo.black);
   Expo.drawString(g, "t", cS+165, 40);
  }
  
   public static void colorBoxes(Graphics g){
   Expo.setColor(g, Expo.red);
   Expo.fillRectangle(g, 10, 10, 40, 40);
   Expo.setColor(g, Expo.black);
   Expo.drawRectangle(g, 10, 10, 40, 40);
   
   Expo.setColor(g, Expo.orange);
   Expo.fillRectangle(g, 50, 10, 80, 40);
   Expo.setColor(g, Expo.black);
   Expo.drawRectangle(g, 50, 10, 80, 40);
   
   Expo.setColor(g, Expo.yellow);
   Expo.fillRectangle(g, 90, 10, 120, 40);
   Expo.setColor(g, Expo.black);
   Expo.drawRectangle(g, 90, 10, 120, 40);
   
   Expo.setColor(g, Expo.green);
   Expo.fillRectangle(g, 170, 10, 200, 40);
   Expo.setColor(g, Expo.black);
   Expo.drawRectangle(g, 170, 10, 200, 40);
   
   Expo.setColor(g, Expo.blue);
   Expo.fillRectangle(g, 130, 10, 160, 40);
   Expo.setColor(g, Expo.black);
   Expo.drawRectangle(g, 130, 10, 160, 40);
   
   Expo.setColor(g, Expo.indigo);
   Expo.fillRectangle(g, 210, 10, 240, 40);
   Expo.setColor(g, Expo.black);
   Expo.drawRectangle(g, 210, 10, 240, 40);
   
   Expo.setColor(g, Expo.violet);
   Expo.fillRectangle(g, 250, 10, 280, 40);
   Expo.setColor(g, Expo.black);
   Expo.drawRectangle(g, 250, 10, 280, 40);
   
   Expo.setColor(g, Expo.black);
   Expo.fillRectangle(g,290, 10, 320, 40);
   Expo.setColor(g, Expo.black);
   Expo.drawRectangle(g,290, 10, 320, 40);
   
   Expo.setColor(g, Expo.white);
   Expo.fillRectangle(g,330, 10, 360, 40);
   Expo.setColor(g, Expo.black);
   Expo.drawRectangle(g,330, 10, 360, 40);
   }
}