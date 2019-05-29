import java.awt.*;
import java.applet.*;

public class Person
{
  public static void body(Graphics g)
  {
    Expo.setColor(g, Expo.red);
    Expo.fillRectangle(g, 0, 1000, 100, 0);
    
  }
  public static void head(Graphics g)
  {
    Expo.setColor(g, Expo.white);
    Expo.fillCircle(g, 80, 70, 150); 
  }
  public static void face(Graphics g)
  {
     Expo.setColor(g, Expo.black); 
     Expo.fillOval(g, 120, 120, 15, 15); 
     Expo.fillOval(g, 170, 120, 15, 15); 
     Expo.drawCircle(g, 150, 175, 20); 
  }
}
