// 11.  Write a program that creates a class circle with instance variables
//      for the center and the radius. Initialize and display its variables. 
//      Use a constructor in the class circle to initialize its variables. 
//      Also, Create a Methods that display the area and perimeter of the Circle.

import java.util.Scanner;

class Circle {
  double x, y, r;

  Circle(double x, double y, double r) {
    this.x = x;
    this.y = y;
    this.r = r;
  }

  public double area() {
    return (22 * r * r) / 7;
  }

  public double perimeter() {
    return (22 * 2 * r) / 7;
  }

}

class prog11 {

  public static void main(final String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Coordinates:");
    double x = sc.nextDouble();
    double y = sc.nextDouble();

    System.out.println("Enter the radius:");
    double rad = sc.nextDouble();

    Circle a = new Circle(x, y, rad);
    System.out.println("Area of Circle is: " + a.area());
    System.out.println("Perimeter of Circle is: " + a.perimeter());
    sc.close();
  }
}
