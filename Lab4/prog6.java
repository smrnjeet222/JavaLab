// Implement the following classes. Author class will have no member functions. Only private
// variables.
// Assume that a book is written by one (and exactly one) author. The Book class (as shown in the class
// diagram) contains the following members:
//  Four private member variables: name (String), author (an instance of the Author class we have
// just created, assuming that each book has exactly one author), price (double), and qty (int).
//  The public getters and
// setters: getName(), getAuthor(), getPrice(), setPrice(), getQty(), setQty().
//  A toString() that returns "'book-name' by author-name (gender) at email". You could reuse
// the Author's toString() method, which returns "author-name (gender) at email".
// Write the driver program to test the functions.

class Author {
  private String name, email, gender;

  public Author(String name, String email, String gender) {
    this.name = name;
    this.email = email;
    this.gender = gender;
  }

  public String toString() {
    return "'" + name + "'(" + gender + ") > email at " + email;
  }
}

class Book {
  private String name;
  private Author author;
  private double price;
  private int qty;

  public Book(String name, Author author, double price, int qty) {
    this.name = name;
    this.author = author;
    this.price = price;
    this.qty = qty;
  }

  public String getName() {
    return name;
  }

  public Author getAuthor() {
    return author;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQty() {
    return qty;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }

  public String toString() {
    return "'" + name + "' by " + author;
  }
}

public class prog6 {
  public static void main(String[] args) {

    Author a = new Author("Simranjeet", "simranjeet@gmail.com", "M");

    System.out.println("About Book ::");

    Book pythonbook = new Book("Python", a, 10, 100);
    pythonbook.setPrice(499);
    pythonbook.setQty(50);
    System.out.println("Name : " + pythonbook.getName());
    System.out.println("Price : $" + pythonbook.getPrice());
    System.out.println("Qty : " + pythonbook.getQty());
    System.out.println("Author : " + pythonbook.getAuthor());
  }
}
