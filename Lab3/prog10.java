// 10.  Write a Java program to divide a string into n equal parts.

import java.util.Scanner;

class prog10 {
  static void splitString(String str, int n) {
    int str_size = str.length();
    int part_size;
    if (str_size % n != 0) {
      System.out.println("The size of the given string is not divisible by " + n);
      return;
    } else {
      System.out.println("The given string is: " + str);
      System.out.println("The string divided into " + n + " parts and they are: ");
      part_size = str_size / n;
      for (int i = 0; i < str_size; i++) {
        if (i % part_size == 0)
          System.out.println();
        System.out.print(str.charAt(i));
      }
    }
  }

  public static void main(String[] args) {
    String str = "abcdefghijklmnopqrstuvwxy";

    System.out.println("Enter split number :: ");
    Scanner sc = new Scanner(System.in);
    int split_number = sc.nextInt();

    splitString(str, split_number);

    sc.close();
  }
}
