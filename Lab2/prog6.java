// 6.Write a program to calculate the sum of elements before and after the given index in an Array.

import java.util.Arrays;
import java.util.Scanner;

public class prog6 {
  public static void main(String args[]) {
    System.out.println("Enter the required size of the array :: ");
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int myArray[] = new int[size];
    int sum = 0;
    System.out.println("Enter the index :");
    int idx = sc.nextInt();
    System.out.println("Enter the elements of the array ");

    int sum_begin = 0;

    for (int i = 0; i < size; i++) {
      myArray[i] = sc.nextInt();
      sum += myArray[i];
      if (i < idx) {
        sum_begin += myArray[i];
      }
    }

    System.out.println("Elements of the array are: " + Arrays.toString(myArray));
    System.out.println("Sum of the first " + idx + " elements :: " + sum_begin);
    System.out.println("Sum of the remaining elements :: " + (sum - sum_begin));

    sc.close();
  }
}