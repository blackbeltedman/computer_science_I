import java.awt.*;
import java.applet.*;

public class Background
{
  public static void ground(Graphics g)
  {
    Expo.setColor(g, Expo.lightGreen);
    Expo.fillRectangle(g, 0, 1000, 1800, 500);
  }
  public static void sky(Graphics g)
  {
    Expo.setColor(g, Expo.lightBlue);
    Expo.fillRectangle(g, 0, 500, 1800, 0);
  }
  public static void sun(Graphics g)
  {
    Expo.setColor(g, Expo.yellow);
    Expo.fillStar(g, 1300, 100, 50, 20);
  }
}
