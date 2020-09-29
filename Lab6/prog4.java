// Write a program to show multiple try-catch block implementation

public class prog4 {

  public static void main(String[] args) {

    try {
      int a[] = new int[5];
      a[5] = 30 / 0;
    } catch (ArithmeticException e) {
      System.out.println("Arithmetic Exception occurs");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("ArrayIndexOutOfBounds Exception occurs");
    } catch (Exception e) {
      System.out.println("Parent Exception occurs");
    }

    System.out.println("rest of the code 1 ");

    try {
      int a[] = new int[5];
      a[5] = 30 / 5;
      System.out.println(a[10]);
    } catch (ArithmeticException e) {
      System.out.println("Arithmetic Exception occurs");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("ArrayIndexOutOfBounds Exception occurs");
    } catch (Exception e) {
      System.out.println("Parent Exception occurs");
    }

    System.out.println("rest of the code 2 ");
  }
}
