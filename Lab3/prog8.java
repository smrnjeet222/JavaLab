// 8.  Write a program that accepts a number and displays the output in word.
//  Eg. Input – 123 , output – One Hundred Twenty Three

import java.util.Scanner;

class prog8 {
  private static String[] SPECIALS = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
      "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
  private static String[] TENS = { "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
      "Ninety" };
  private static String[] THOUSANDS = { "", "Thousand", "Million", "Billion" };

  public static String numberToWords(int num) {
    if (num == 0)
      return "Zero";
    int index = 0;
    String res = "";
    while (num > 0) {
      if (num % 1000 != 0) {
        res = helper(num % 1000) + THOUSANDS[index] + " " + res;
      }
      index++;
      num /= 1000;
    }
    return res.trim();
  }

  public static String helper(int num) {
    if (num == 0) {
      return "";
    } else if (num < 20) {
      return SPECIALS[num] + " ";
    } else if (num < 100) {
      return TENS[num / 10] + " " + helper(num % 10);
    } else {
      return SPECIALS[num / 100] + " Hundred " + helper(num % 100);
    }
  }

  public static void main(final String[] args) {
    System.out.println("Enter the Number :: ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    String wrds = numberToWords(num);
    System.out.println("Number is : " + wrds);

    sc.close();
  }
}
