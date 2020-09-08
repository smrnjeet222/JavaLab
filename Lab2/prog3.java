// 3.Write a Program to check whether the input year is leap or not

import java.util.Scanner;

public class prog3 {
  public static void main(String[] args) {
    int year;
    System.out.println("Enter an Year :: ");
    Scanner sc = new Scanner(System.in);
    year = sc.nextInt();

    if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
      System.out.println("Specified year is a leap year");
    else
      System.out.println("Specified year is not a leap year");

    sc.close();

  }
}