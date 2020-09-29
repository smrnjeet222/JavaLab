//  Write an application that creates an interface shape with an abstract function area and 
//  implements it. Try to write two or more classes that implement this interface and each 
//  should have different implementation of area function.
//  Also write a driver program that will create the object of classes
//  and show how area function works

interface ShapeInf {
  public double area();

  public double perimeter();
}

class Rectangle implements ShapeInf {
  private final double width, length;

  public Rectangle(final double w, final double l) {
    this.width = w;
    this.length = l;
  }

  public double area() {
    return width * length;
  }

  public double perimeter() {
    return 2 * (width + length);
  }

}

class Circle implements ShapeInf {
  private final double radius;
  final double pi = Math.PI;

  public Circle(final double r) {
    this.radius = r;
  }

  public double area() {
    return pi * Math.pow(radius, 2);
  }

  public double perimeter() {
    return 2 * pi * radius;
  }
}

class Triangle implements ShapeInf {
  private final double a, b, c;

  public Triangle(final double a, final double b, final double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public double area() {
    final double s = (a + b + c) / 2;
    return Math.sqrt(s * (s - a) * (s - b) * (s - c));
  }

  public double perimeter() {
    return a + b + c;
  }
}

public class prog2 {
  public static void main(final String[] args) {

    // Rectangle
    final double width = 5, length = 7;
    final ShapeInf rectangle = new Rectangle(width, length);
    System.out.println("Rectangle width: " + width + " and length: " + length);
    System.out.println("Resulting Area: " + rectangle.area());
    System.out.println("Resulting Perimeter: " + rectangle.area() + "\n");

    // Circle
    final double radius = 5;
    final ShapeInf circle = new Circle(radius);
    System.out.println("Circle radius: " + radius);
    System.out.println("Resulting Area: " + circle.area());
    System.out.println("Resulting Perimeter: " + circle.area() + "\n");

    // Triangle
    final double a = 5, b = 3, c = 4;
    final ShapeInf triangle = new Triangle(a, b, c);
    System.out.println("Triangle sides lengths: " + a + ", " + b + ", " + c);
    System.out.println("Resulting Area: " + triangle.area());
    System.out.println("Resulting Perimeter: " + triangle.perimeter() + "\n");
  }

}
