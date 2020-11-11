// Write an Applet that displays a counter in the middle of applet.

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class prog4 extends Applet implements ActionListener {
  private Label lblCnt;
  private TextField tfCnt;
  private Button btnCnt;
  private int cnt = 0;

  public void init() {

    lblCnt = new Label("Counter");
    add(lblCnt);

    tfCnt = new TextField(cnt + "", 10);
    tfCnt.setEditable(false);
    add(tfCnt);

    btnCnt = new Button("Count");
    add(btnCnt);
    btnCnt.addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent evt) {
    ++cnt;
    tfCnt.setText(cnt + "");
  }

  public void paint(Graphics g) {
    showStatus("Simranjeet  41314802718");
  }

}
