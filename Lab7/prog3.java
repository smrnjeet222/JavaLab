// Write an Applet displaying line, rectangle, rounded rectangle,
//  filled rectangle, filled rounded rectangle, circle, ellipse, 
// arc, filled arc and polygon, all in different colors

import java.applet.Applet;
import java.awt.*;

public class prog3 extends Applet {

  public void paint(Graphics g) {
    showStatus("Simranjeet  41314802718");

    int x[] = { 10, 30, 40, 50, 110, 140 };
    int y[] = { 140, 110, 50, 40, 30, 10 };
    int numberofpoints = 6;
    g.setColor(Color.blue);
    g.drawPolygon(x, y, numberofpoints);

    g.setColor(Color.black);
    g.drawOval(150, 10, 50, 50);
    g.drawOval(150, 70, 70, 30);
    g.drawArc(150, 120, 30, 30, 30, 220);
    g.setColor(Color.pink);
    g.fillArc(150, 160, 30, 30, 30, 220);

    g.drawLine(250, 10, 310, 10);
    g.drawRect(250, 20, 60, 30);
    g.drawRoundRect(250, 60, 60, 30, 15, 15);
    g.setColor(Color.red);
    g.fillRect(250, 100, 60, 30);
    g.setColor(Color.blue);
    g.fillRoundRect(250, 140, 60, 30, 15, 15);
  }
}
