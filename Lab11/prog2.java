// Convert the content of a given file into the uppercase content of the same file.

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

import java.util.Scanner;
import java.io.*;
import java.nio.CharBuffer;

public class prog2 {
  public static void main(String[] args) throws IOException {
    String filename;
    String message;
    String filename2;

    // Create a Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);

    // Get the filename.
    System.out.print("Enter the filename: ");
    filename = keyboard.nextLine();

    // Open the file.
    FileWriter fwriter = new FileWriter(filename);
    PrintWriter outputFile = new PrintWriter(fwriter);

    // Get the message to be written in the file.
    System.out.println("Enter a message: ");
    message = keyboard.nextLine();

    // Write the message to the file.
    outputFile.println(message);

    // Close the file.
    outputFile.close();

    // Get the second file's name.
    System.out.println("Enter the name of the second file: ");
    filename2 = keyboard.nextLine();

    // Open an input file.
    FileReader freader = new FileReader(filename2);
    BufferedReader inputFile = new BufferedReader(freader);
    String str;

    // Read the first item.
    str = inputFile.readLine();

    // If the item was read, display it in UpperCase.
    while (str != null) {
      System.out.println(str);
      CharBuffer upper = message.toUpperCase();
      str = inputFile.read(upper);
    }

    // Close the file.
    inputFile.close();
  }
}
