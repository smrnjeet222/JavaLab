// Using Mouse adapter classes, write an Applet for which 
// an filled eclipse is painted when mouse is dragged at the 
// position of mouse's x and y co-ordinate.
// x-radius and y-radius should be same for the eclipse

import java.awt.*;
import java.awt.event.*;

class windowCloser extends WindowAdapter {
  public void widowClosing(WindowEvent evt) {
    System.exit(0);
  }
}

public class prog1 extends MouseMotionAdapter {

  Frame f;

  public void testMouseAdapter() {
    f = new Frame("Mouse Motion Adapter");
    f.addMouseMotionListener(this);
    f.setSize(300, 300);
    f.setLayout(null);
    f.setVisible(true);
    f.addWindowListener(new windowCloser());
  }

  public void mouseDragged(MouseEvent e) {
    Graphics g = f.getGraphics();
    g.setColor(Color.YELLOW);
    g.fillOval(e.getX(), e.getY(), 20, 20);
  }

  public static void main(String[] args) {
    new prog1();
  }
}
