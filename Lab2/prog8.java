// 8.Write a Program that creates an Object of Class Person. It should set the values of instance
//  variables and then display these values as Output on command line.

//  THIS IS SAME AS PROGRAMME 7

import java.util.Scanner;

class Person {
  int age;
  String name;
  float salary;
  Scanner get = new Scanner(System.in);

  Person() {
    System.out.println("Enter Name of the Person:");
    name = get.nextLine();
    System.out.println("Enter Age:");
    age = get.nextInt();
    System.out.println("Enter Salary:");
    salary = get.nextFloat();
  }

  void display() {
    System.out.println("Person Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
  }
}

class prog8 {
  public static void main(String args[]) {
    System.out.println("==============" + "\n" + "Enter Person's Details" + "\n" + "================" + "\n");

    Person p1 = new Person();

    System.out
        .println("===============" + "\n" + "Here are the details you entered" + "\n" + "================" + "\n");
    p1.display();
  }
}