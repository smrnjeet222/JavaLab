// Q3. We have to calculate the percentage of marks obtained in three subjects (each out of 100) by
//  student A and in four subjects (each out of 100) by student B. Create an abstract class 'Marks' 
//  with an abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' each 
//  having a method with the same name which returns the percentage of the students. The constructor
//  of student A takes the marks in three subjects as its parameters and the marks in four subjects
//  as its parameters for student B. Create an object for eac of the two classes and print the 
//  percentage of marks for both the students.

abstract class Marks {
  public abstract double getPercentage();
}

class A extends Marks {
  double first, second, third;

  public A(double a, double b, double c) {
    first = a;
    second = b;
    third = c;
  }

  public double getPercentage() {
    return (first + second + third) / 3;
  }

}

class B extends Marks {
  double first, second, third, fourth;

  public B(double a, double b, double c, double d) {
    first = a;
    second = b;
    third = c;
    fourth = d;
  }

  public double getPercentage() {
    return (first + second + third + first) / 4;
  }

}

public class prog3 {
  public static void main(String[] args) {
    A a = new A(79, 82, 63);
    B b = new B(42, 96, 70, 79);
    System.out.println("A got : " + a.getPercentage() + " %");
    System.out.println("B got : " + b.getPercentage() + " %");

  }

}
