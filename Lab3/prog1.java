// 1.  Write a program to find out the array index or position where the sum of numbers
//   preceding the index is equal to the sum of numbers succeeding the index.

import java.util.Scanner;

class prog1 {
  public static int findMiddleIndex(int[] array) throws Exception {
    int endIndex = array.length - 1;
    int startIndex = 0;
    int leftSum = 0;
    int rightSum = 0;
    while (true) {
      if (leftSum > rightSum) {
        rightSum += array[endIndex--];
      } else {
        leftSum += array[startIndex++];
      }
      if (startIndex > endIndex) {
        if (leftSum == rightSum) {
          break;
        } else {
          throw new Exception("No such combination found in the array.");
        }
      }
    }
    return endIndex;
  }

  public static void main(final String[] args) {
    System.out.println("Enter the required size of the array :: ");
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int myArray[] = new int[size];
    System.out.println("Enter the elements of the array :: ");

    for (int i = 0; i < size; i++) {
      myArray[i] = sc.nextInt();
    }

    try {
      int index = findMiddleIndex(myArray);
      System.out.println("Sum preceding the index " + index + " is equal to sum succeeding the index " + index);
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
    sc.close();
  }
}
