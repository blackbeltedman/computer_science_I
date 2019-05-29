import java.awt.*;
import java.applet.*;

public class Toast
{
  public static void bread(Graphics g)
  {
    Expo.setColor(g, Expo.green);
    Expo.fillRectangle(g, 600, 300, 800, 200);
  }
  public static void crust(Graphics g)
  {
    Expo.setColor(g, Expo.darkGreen);
    for(int i = 1; i<=10; i++){
      Expo.drawRectangle(g, 600+i, 300-i, 800-i, 200+i);
    }
  }
  public static void money(Graphics g)
  {
    Expo.setColor(g, Expo.darkGreen);
    Expo.drawString(g, "$", 690, 265);
    for(int i = 1; i<=6; i++){
      Expo.drawCircle(g, 699, 253, 20+i);
    }
  }
}
