// Write a program that displays the life cycle of an Applet.

import java.awt.*;
import java.applet.*;

public class prog2 extends Applet {
  public void init() {
    System.out.println("Applet initialized");
  }

  public void start() {
    System.out.println("Applet execution started");
  }

  public void stop() {
    System.out.println("Applet execution stopped");
  }

  public void paint(Graphics g) {
    showStatus("Simranjeet  41314802718");
    System.out.println("Painting...");
  }

  public void destroy() {
    System.out.println("Applet destroyed");
  }
}