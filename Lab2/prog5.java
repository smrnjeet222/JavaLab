// 5.Write an application that accepts radius of a circle as its command line argument display the area.

import java.util.Scanner;

class prog5 {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the radius:");
    double r = sc.nextDouble();
    double area = (22 * r * r) / 7;
    System.out.println("Area of Circle is: " + area);

    sc.close();

  }
}