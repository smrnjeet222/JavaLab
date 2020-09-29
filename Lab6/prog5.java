// Write an applet to draw a banner with your name and enrollment number in Java

import java.applet.*;
import java.awt.*;

public class prog5 extends Applet {

  private static final long serialVersionUID = 1L;

  String str = "Simranjeet Singh : 41314802718";

  public void paint(final Graphics g) {
    g.drawRect(1, 1, 600, 350);
    g.setColor(Color.white);
    g.fillRect(1, 1, 400, 250);
    g.setColor(Color.black);
    g.drawString(str, 100, 50);
  }
}