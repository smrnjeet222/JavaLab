// Given Class Dog.java, derive two subclasses as specific breeds of dogs. Then calculate the
// average weight of dog. Each class derived from dog.java should have an instance variable
// of weight
class Dog {
  protected String name;

  public Dog(String n) {
    this.name = n;
  }

  public String getName() {
    return name;
  }

  public String speak() {
    return "Woof";
  }
}

class Maltese extends Dog {
  private double weight;

  public Maltese(String name, double weight) {
    super(name);
    this.weight = weight;
  }

  public double average_weight() {
    return weight;
  }
}

class Huskies extends Dog {
  private double weight;

  public Huskies(String name, int weight) {
    super(name);
    this.weight = weight;
  }

  public double average_weight() {
    return weight;
  }

}

public class prog3 {
  public static void main(String args[]) {

    Huskies h = new Huskies("Siberio", 21);
    System.out.println("Name of Husky is : " + h.getName());
    System.out.println("Weight of " + h.getName() + " is: " + h.average_weight());

    System.out.println("");

    Maltese m = new Maltese("Puffy", 15);
    System.out.println("Name of Maltese is : " + m.getName());
    System.out.println("Weight of " + m.getName() + " is: " + m.average_weight());
  }
}