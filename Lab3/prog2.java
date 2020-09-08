// 2. Write a program that creates and initializes a four-element int array. 
// Calculate and display the average of its values.

import java.util.Scanner;

class prog2 {
  public static void main(final String[] args) {
    Scanner sc = new Scanner(System.in);
    float myArray[] = new float[4];
    System.out.println("Enter the 4 elements of the array :: ");

    float sum = 0;
    for (int i = 0; i < 4; i++) {
      myArray[i] = sc.nextInt();
      sum += myArray[i];
    }

    System.out.println("Average = " + sum / 4);

    sc.close();
  }
}
