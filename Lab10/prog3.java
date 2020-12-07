// Write a program to demonstrate use of Mouse Listener. 
// If we click and drag a filled eclipse should be painted 
// with equal x-radius and y-radius and a color of your choice.

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class prog3 extends Applet implements MouseListener, MouseMotionListener {
  private int x, y;

  public void init() {
    this.addMouseListener(this);
    this.addMouseMotionListener(this);
  }

  public void paint(Graphics g) {
    g.setColor(Color.yellow);
    g.fillOval(x, y, 20, 20);
  }

  public void update(Graphics g) {
    paint(g);
  }

  public void mouseClicked(MouseEvent m) {

  }

  public void mouseEntered(MouseEvent m) {
  }

  public void mouseExited(MouseEvent m) {
  }

  public void mousePressed(MouseEvent m) {
  }

  public void mouseReleased(MouseEvent m) {
  }

  public void mouseMoved(MouseEvent m) {
  }

  public void mouseDragged(MouseEvent m) {
    x = m.getX();
    y = m.getY();
    repaint();
  }
}
