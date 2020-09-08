// 5.  Write a program that can count the number of instances created for the class.
class Test {

  static int noOfObjects = 0;
  {
    noOfObjects += 1;
  }

}

class prog5 {
  public static void main(final String[] args) {
    // Test t1 = new Test();
    // Test t2 = new Test();
    // Test t3 = new Test();

    System.out.println("No. of instances created : " + Test.noOfObjects);
  }
}
