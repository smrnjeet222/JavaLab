// 4.Write an application that accepts two doubles as its command line arguments, 
// multiple these together and display the product.

import java.util.Scanner;

public class prog4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Please enter first number:");
    double n1 = sc.nextDouble();
    System.out.print("Please enter second number:");
    double n2 = sc.nextDouble();

    double product = n1 * n2;
    System.out.println(n1 + "*" + n2 + " = " + product);

    sc.close();

  }
}