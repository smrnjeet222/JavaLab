// Write a Program that illustrates how to process mouse click, enter, exit, press and release events. 
// The background color changes when the mouse is entered, clicked, pressed, released or exited.

import java.awt.*;
import java.awt.event.*;

public class prog3 extends Frame implements MouseListener {
    Label l;

    prog3() {
        addMouseListener(this);

        l = new Label();
        l.setBounds(20, 50, 100, 20);
        add(l);
        setSize(250, 250);
        setLayout(null);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
        setBackground(Color.WHITE);
    }

    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
        setBackground(Color.GREEN);
    }

    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
        setBackground(Color.GRAY);
    }

    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
        setBackground(Color.RED);
    }

    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
        setBackground(Color.CYAN);
    }

    public static void main(String[] args) {
        new prog3();
    }
}