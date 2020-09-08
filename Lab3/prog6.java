// 6.  Using the concept of method overloading,  Write method for 
// calculating the area of a triangle, circle, and rectangle.

class Area {
  Area() {

  }

  void calculateArea(double r) {
    double area = 3.14 * r * r;
    System.out.println("Area of the circle: " + area + " sq units");
  }

  void calculateArea(double x, double y) {
    System.out.println("Area of the rectangle: " + x * y + " sq units");
  }

  void calculateArea(double a, double b, double c) {
    if ((a + b) > c && (a + c) > b && (b + c) > a) {
      double s = (a + b + c) / 2;
      double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
      System.out.println("Area of the triangle: " + area + " sq units");
    } else {
      System.out.println("Triangle doesn't exist");
    }
  }

}

class prog6 {
  public static void main(final String[] args) {
    Area obj = new Area();

    obj.calculateArea(6.1f);

    obj.calculateArea(10f, 22f);

    obj.calculateArea(4f, 4f, 4.2f);

  }
}
