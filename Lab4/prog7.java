// 7. Implement the following classes
// Write the driver program to test the cylinder class

class CircleProp {
  private double radius;
  private String color;

  public CircleProp() {
    this.radius = 1.0;
    this.color = "red";
  }

  public CircleProp(double r) {
    radius = r;
    color = "red";
  }

  public CircleProp(double r, String c) {
    radius = r;
    color = c;
  }

  public double getRadius() {
    return radius;
  }

  public String getColor() {
    return color;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getArea() {
    return radius * radius * Math.PI;
  }
}

class Cylinder extends CircleProp {
  private double height;

  public Cylinder() {
    super();
    height = 1.0;
  }

  public Cylinder(double h) {
    super();
    height = h;
  }

  public Cylinder(double h, double r) {
    super(r);
    height = h;
  }

  public Cylinder(double h, double r, String c) {
    super(r, c);
    height = h;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double h) {
    this.height = h;
  }

  public double getVolume() {
    return getArea() * height;
  }

}

public class prog7 {
  public static void main(String[] args) {
    Cylinder c1 = new Cylinder();

    System.out.println("\nCylinder 1\n");

    System.out.println("Radius : " + c1.getRadius());
    System.out.println("Height : " + c1.getHeight());
    System.out.println("Color : " + c1.getColor());
    System.out.println("Area : " + c1.getArea());
    System.out.println("Volume : " + c1.getVolume());

    System.out.println("\nCylinder 2\n");

    Cylinder c2 = new Cylinder(7.0, 4.0);

    System.out.println("Radius : " + c2.getRadius());
    System.out.println("Height : " + c2.getHeight());
    System.out.println("Color : " + c2.getColor());
    System.out.println("Area : " + c2.getArea());
    System.out.println("Volume : " + c2.getVolume());

  }
}