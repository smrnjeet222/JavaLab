// Create a class person which contains basic information like name, age, phonenumber etc.
// Now derive a class employee which contains employee information like employee number,
// employee name, phone number etc. Now write a driver class which can compare two
// employees to show whether the employee are same or not. Hint: Use the equals method,
// which is inherited from the Object class, to determine whether two players are the same.
// You will need to override this method so that it gives the right result.

class Person {
  private String name;
  private int age, phoneNumber;

  Person(String n, int a, int pn) {
    this.name = n;
    this.age = a;
    this.phoneNumber = pn;
  }

  public boolean equals(Person obj) {
    return obj.name == this.name && obj.age == this.age && obj.phoneNumber == this.phoneNumber;
  }
}

class Employee extends Person {
  private int ENumber;

  Employee(String n, int a, int pn, int en) {
    super(n, a, pn);
    this.ENumber = en;
  }

  public boolean equals(Employee obj) {
    return super.equals(obj) && this.ENumber == obj.ENumber;
  }
}

public class prog5 {
  public static void main(String args[]) {
    Employee e1 = new Employee("Simranjeet", 20, 46327, 1);
    Employee e2 = new Employee("Simranjeet", 20, 46327, 1);
    String s = (e1.equals(e2)) ? "Same employee!" : "Different employee!";

    System.out.println(s);

  }
}
