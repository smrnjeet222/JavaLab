// WAP that creates a class circle with instance variables for the center and the radius. 
// It should have overloaded constructor. 
// If the user passes values then the values should be assigned to 
// the centre co-ordinates and radius, otherwise they should be assigned any 
// value that you find fit. It should also have a function to calculate Area and Perimeter. 
// Also, Define a plot function that can display where the centre is located, 
// what is the diameter of the circle and its area and perimeter.

import java.util.Scanner;

class Circle {
  private double cx, cy, radius;

  public Circle() {
    this.cx = 0;
    this.cy = 0;
    this.radius = 1.0;
  }

  public Circle(double cx, double cy, double r) {
    this.radius = r;
    this.cx = cx;
    this.cy = cy;
  }

  public double getRadius() {
    return radius;
  }

  public double getArea() {
    return radius * radius * Math.PI;
  }

  public double getPerimeter() {
    return 2 * radius * Math.PI;
  }

  public void Plot() {
    System.out.println("\nCenter is :: " + this.cx + " , " + this.cy);
    System.out.println("Diameter is :: " + this.radius * 2);
    System.out.println("Area is :: " + this.getArea());
    System.out.println("Perimeter is :: " + this.getPerimeter());
  }
}

public class prog1 {
  public static void main(final String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Coordinates:");
    double x = sc.nextDouble();
    double y = sc.nextDouble();

    System.out.println("Enter the radius:");
    double rad = sc.nextDouble();

    Circle c1 = new Circle(x, y, rad);

    c1.Plot();

    System.out.println("Circle 2");

    Circle c2 = new Circle();

    c2.Plot();

    sc.close();
  }

}