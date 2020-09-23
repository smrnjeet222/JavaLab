// Q4. We have to calculate the area of a rectangle, a square and a circle. Create an abstract
//  class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters,
//  SquareArea' and 'CircleArea' taking one parameter each. The parameters of 'RectangleArea' are
//  its length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius. 
//  Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' 
//  and 'CircleArea' for printing the area of rectangle, square and circle respectively. Create an 
//  object of class 'Area' and call all the three methods.

abstract class Shape {
  public abstract double RectangleArea(double l, double b);

  public abstract double SquareArea(double s);

  public abstract double CircleArea(double r);
}

class Area extends Shape {
  public double RectangleArea(double l, double b) {
    return l * b;
  }

  public double SquareArea(double s) {
    return s * s;
  }

  public double CircleArea(double r) {
    return 3.14 * r * r;
  }
}

public class prog4 {
  public static void main(String[] args) {
    Area shapes = new Area();
    System.out.println("Area of rectangle : " + shapes.RectangleArea(40, 12));
    System.out.println("Area of square : " + shapes.SquareArea(45));
    System.out.println("Area of circle : " + shapes.CircleArea(7));
  }
}
