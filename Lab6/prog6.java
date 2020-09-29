// Write an applet to draw a car.

import java.applet.*;
import java.awt.*;

/*
<applet code="car.java" height=350 width=800>
</applet>
*/
public class prog6 extends Applet {
  private static final long serialVersionUID = 1L;

  public void paint(final Graphics g) {
    g.fillRoundRect(50, 50, 250, 150, 20, 20);
    g.setColor(Color.green);
    g.fillRoundRect(210, 45, 150, 80, 15, 15);
    g.fillArc(65, 165, 90, 70, 0, 180);
    g.fillArc(200, 165, 90, 70, 0, 180);
    g.setColor(Color.gray);
    g.fillRoundRect(70, 60, 50, 50, 15, 15);
    g.fillRoundRect(135, 60, 50, 50, 15, 15);
    g.fillArc(284, 140, 20, 20, 270, 180);
    g.setColor(Color.black);
    g.fillOval(70, 170, 80, 80);
    g.fillOval(205, 170, 80, 80);
    g.setColor(Color.red);
    g.fillArc(43, 140, 15, 15, 90, 180);
    g.setColor(Color.lightGray);
    g.fillArc(434, 160, 15, 15, 90, 180);
    g.setColor(Color.yellow);
    g.fillArc(43, 180, 15, 15, 90, 180);
    g.setColor(Color.red);
    g.drawLine(300, 120, 300, 130);
    g.fillOval(298, 117, 9, 7);
  }
}
