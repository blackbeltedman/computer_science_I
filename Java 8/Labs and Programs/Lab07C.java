
import java.awt.*;
import java.applet.*;


public class Lab07C extends Applet
{
 public void paint(Graphics g)
 {
      // Substitute your own name here.
      Expo.drawHeading(g,"************","7C");   
   
  // Draw Grid
  Expo.drawLine(g,250,50,250,650);
  Expo.drawLine(g,500,50,500,650);
  Expo.drawLine(g,750,50,750,650);
  Expo.drawLine(g,0,350,1000,350);


  // Draw 10,000 Random Points
  for (int count = 1; count <= 10000; count++)
  {
   Expo.setRandomColor(g);
   int x = Expo.random(5,245);
   int y = Expo.random(55,345);
   Expo.drawPoint(g,x,y);
  }


  // Draw 1000 Random Lines
  for (int count = 1; count <= 1000; count++)
  {
   Expo.setRandomColor(g);
   int x1 = Expo.random(250,495);
   int y1 = Expo.random(55,345);
   int x2 = Expo.random(250,495);
   int y2 = Expo.random(55,345);
   Expo.drawLine(g, x1, y1, x2, y2);
  }

  // Draw 1000 Random Rectangles
  for (int count = 1; count <= 1000; count++)
  {
   Expo.setRandomColor(g);
   int x1 = Expo.random(505,745);
   int y1 = Expo.random(55,345);
   int x2 = Expo.random(505,745);
   int y2 = Expo.random(55,345);
   Expo.fillRectangle(g, x1, y1, x2, y2);
  }

  // Draw 500 Random Triangles
  for (int count = 1; count <= 500; count++)
  {
   Expo.setRandomColor(g);
   int x1 = Expo.random(750,995);
   int y1 = Expo.random(55,345);
   int x2 = Expo.random(750,995);
   int y2 = Expo.random(55,345);
   int x3 = Expo.random(750,995);
   int y3 = Expo.random(55,345);
   Expo.fillPolygon(g, x1, y1, x2, y2, x3, y3);
  }

  // Draw 100 Random Initials
  for (int count = 1; count <= 100; count++)
  {
   Expo.setFont(g, "TimesRoman",Font.BOLD+Font.ITALIC,Expo.random(12, 28)); 
   Expo.setRandomColor(g);
   int x = Expo.random(5, 200);
   int y = Expo.random(390, 630);
   Expo.drawString(g, "NM", x, y);
  }

  // Draw 500 Random Stars with a constant radius of 30 and a random # of points
  for (int count = 1; count <= 500; count++)
  {
   Expo.setRandomColor(g);
   int x = Expo.random(280,465);
   int y = Expo.random(390, 630);
   int p = Expo.random(5, 10);
   Expo.fillStar(g, x, y, 30, p);
  }

  // Draw 1000 Random Circles with random radii
  for (int count = 1; count <= 1000; count++)
  {
   Expo.setRandomColor(g);
   int x = Expo.random(575, 675);
   int y = Expo.random(425, 590);
   int r = Expo.random(0, 75);
   Expo.fillCircle(g,x,y,r);
  }

  // Draw 250 Random Ovals with 2 random radii
  for (int count = 1; count <= 250; count++)
  {
   Expo.setRandomColor(g);
   int x = Expo.random(825, 935);
   int y = Expo.random(425, 585);
   int r1 = Expo.random(0, 75);
   int r2 = Expo.random(0, 75);
   Expo.fillOval(g, x, y, r1, r2);
  }

 }

}


