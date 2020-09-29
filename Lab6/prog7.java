// Write an applet to draw a smiling face in java

import java.applet.*;
import java.awt.*;

public class prog7 extends Applet {

  private static final long serialVersionUID = 1L;

  public void paint(final Graphics g) {

    g.drawOval(80, 70, 150, 150);

    g.setColor(Color.BLACK);
    g.fillOval(120, 120, 15, 15);
    g.fillOval(170, 120, 15, 15);

    g.drawArc(130, 180, 50, 20, 180, 180);
  }
}