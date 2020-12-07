// Write a program to create an applet to demonstrate a simple calculator.

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class prog2 extends Applet implements ActionListener {

  TextField t1, t2, t3;
  Button b1, b2, b3, b4;
  Label l1, l2, l3;

  public void init() {
    l1 = new Label("First Number");
    add(l1);
    t1 = new TextField(15);
    add(t1);
    l2 = new Label("Second Number");
    add(l2);
    t2 = new TextField(15);
    add(t2);
    l3 = new Label("Result");
    add(l3);
    t3 = new TextField(15);
    add(t3);
    b1 = new Button("Addition");
    add(b1);
    b1.addActionListener(this);
    b2 = new Button("Subtraction");
    add(b2);
    b2.addActionListener(this);
    b3 = new Button("Multiplication");
    add(b3);
    b3.addActionListener(this);
    b4 = new Button("Division");
    add(b4);
    b4.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b1) {
      int x = Integer.parseInt(t1.getText());
      int y = Integer.parseInt(t2.getText());
      int sum = x + y;
      t3.setText(" " + sum);
    }
    if (e.getSource() == b2) {
      int x = Integer.parseInt(t1.getText());
      int y = Integer.parseInt(t2.getText());
      int sub = x - y;
      t3.setText(" " + sub);
    }
    if (e.getSource() == b3) {
      int x = Integer.parseInt(t1.getText());
      int y = Integer.parseInt(t2.getText());
      int mul = x * y;
      t3.setText(" " + mul);
    }
    if (e.getSource() == b4) {
      int x = Integer.parseInt(t1.getText());
      int y = Integer.parseInt(t2.getText());
      int div = x / y;
      t3.setText(" " + div);
    }
    showStatus("Simranjeet  41314802718");
    repaint();
  }
}
