// 3.  Write a program that creates a 2-d array with int values 
//  the first element should be an array containing 32. 
// The second array should be an array containing 500 and 300. 
// The third element should be an array containing 39.45 and 600. 
// Declare, allocate, and initialize the array display its length and elements.

class prog3 {
  public static void main(final String[] args) {
    int arr[][];
    arr = new int[3][2];
    arr[0][0] = 32;
    arr[1][0] = 500;
    arr[1][1] = 300;
    arr[2][0] = (int) 39.45;
    arr[2][1] = 600;

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 2; j++) {
        System.out.printf("%5s", arr[i][j]);
      }
      System.out.println();
    }

    System.out.println("Length of Arr :" + arr.length);

  }
}
