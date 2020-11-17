//  Write an Applet that draws a dot at a random location in its display area every 200ms.
//  Any existing dots are not erased. Therefore, dots accumulate as the applet executes.

import java.applet.*;
import java.awt.*;

/*<Applet code=randomdot width=200 height=200></Applet>*/

public class prog2 extends Applet implements Runnable {
  Thread th;

  public void init() {
    th = new Thread(this);
    th.start();
  }

  public void run() {
    try {
      while (true) {
        repaint();
        Thread.sleep(200);
      }
    } catch (Exception e) {
    }
  }

  public void update(Graphics g) {
    paint(g);
  }

  public void paint(Graphics g) {
    Dimension d = getSize();

    int x = (int) (Math.random() * d.width);
    int y = (int) (Math.random() * d.height);

    g.fillRect(x, y, 5, 5);

  }
}