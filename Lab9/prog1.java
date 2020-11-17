// Write an Applet that displays a counter in the middle of applet.
//  The counter starts from zero and keeps on incrementing after every second.

import java.applet.Applet;

import java.awt.Dimension;
import java.awt.*;

public class prog1 extends Applet implements Runnable {
  int cntr;
  Thread t;

  public void init() {
    cntr = 0;
    t = new Thread(this);
    t.start();
  }

  public void run() {
    try {
      while (true) {
        repaint();
        Thread.sleep(1000);
        ++cntr;
      }
    } catch (Exception e) {
    }
  }

  public void paint(Graphics g) {
    showStatus("41314802718");

    g.setFont(new Font("Serif", Font.BOLD, 28));
    FontMetrics fm = g.getFontMetrics();
    String s = "" + cntr;
    Dimension d = getSize();
    int x = d.width / 2 - fm.stringWidth(s) / 2;
    int y = d.height / 2;
    g.drawString(s, x, y);
  }
}