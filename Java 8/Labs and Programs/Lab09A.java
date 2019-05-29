
import java.awt.*;
import java.applet.*;


public class Lab09A extends Applet
{
 public void paint(Graphics g)
 {
      // Substitute your own name here.
      Expo.drawHeading(g,"Nilo Mackey","9A");
      Background.ground(g);
      Background.sky(g);
      Background.sun(g);
      Toast.bread(g);
      Toast.crust(g);
      Toast.money(g);
      Person.body(g);
      Person.head(g);
      Person.face(g);
      
 }
}