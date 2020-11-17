// Write a Program that displays your name whenever the mouse is clicked.

import java.awt.*;
import java.awt.event.*;

public class prog4 extends Frame implements MouseListener {
    Label l;

    prog4() {
        addMouseListener(this);

        l = new Label();
        l.setBounds(20, 50, 100, 20);

        add(l);
        setSize(250, 250);
        setVisible(true);
        setLayout(null);
    }

    public void mouseClicked(MouseEvent e) {
        l.setText("Simranjeet Singh");
        setBackground(Color.WHITE);
    }

    public void mouseEntered(MouseEvent e) {
        l.setText("");
        setBackground(Color.GREEN);
    }

    public void mouseExited(MouseEvent e) {
        l.setText("");
        setBackground(Color.GRAY);
    }

    public void mousePressed(MouseEvent e) {
        l.setText("");
        setBackground(Color.RED);
    }

    public void mouseReleased(MouseEvent e) {
        l.setText("");
        setBackground(Color.CYAN);
    }

    public static void main(String[] args) {
        new prog4();
    }
}