// Write a program that defines shape class as an abstract class. 
// It should have Area function. Also, implement this class for any two shapes of your choice

abstract class Shapes {
  abstract public double Area();

  abstract public double Perimeter();
}

class Squares extends Shapes {
  public double side;

  public Squares(double x) {
    this.side = x;
  }

  public double Area() {
    return side * side;
  }

  public double Perimeter() {
    return 4 * side;
  }
}

class Circles extends Shapes {
  public double r;

  public Circles(double x) {
    this.r = x;
  }

  public double Area() {
    return r * r * Math.PI;
  }

  public double Perimeter() {
    return 2 * r * Math.PI;
  }
}

public class prog2 {
  public static void main(String args[]) {

    System.out.println("\nCircle");

    Shapes c1 = new Circles(3);
    System.out.println("Perimeter is :: " + c1.Perimeter());
    System.out.println("Area is :: " + c1.Area());

    System.out.println("\nSquare");

    Shapes s1 = new Squares(3);
    System.out.println("Perimeter is :: " + s1.Perimeter());
    System.out.println("Area is :: " + s1.Area());
  }
}
