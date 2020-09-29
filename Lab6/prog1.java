// Create a customized exception and also make use of all the 5 exception keyword.
//  (try, catch, throw, throws,and finally)

class InvalidAgeException extends Exception {
  // added to remove some warning
  private static final long serialVersionUID = -2714273560914952041L;

  InvalidAgeException(final String s) {
    super(s);
  }
}

public class prog1 {

  public static void validate(final int age) throws InvalidAgeException {
    if (age < 18)
      throw new InvalidAgeException("not valid");
    else
      System.out.println("welcome to vote");
  }

  public static void main(final String[] args) {
    try {
      validate(13);
    } catch (final Exception m) {
      System.out.println("Exception occured =>  " + m);
    } finally {
      System.out.println("Final code...");
    }
  }
}
