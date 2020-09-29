// Write an application to illustrate Interface Inheritance.

interface Readable {
  boolean reads();
}

interface Writeable {
  boolean writes();

}

class Student implements Readable, Writeable {
  public boolean reads() {
    System.out.println("Student reads.. ");
    return true;
  }

  public boolean writes() {
    System.out.println("Student writes..");
    return true;
  }
}

public class prog3 {
  public static void main(String args[]) {
    Student s = new Student();
    s.reads();
    s.writes();
  }
}
