// 2.Write  a Program  to display first n prime numbers.

import java.util.Scanner;

class prog2 {

  static void N_primes(int N) {
    int ct = 0, n = 0, i = 1, j = 1;
    while (n < N) {
      j = 1;
      ct = 0;
      while (j <= i) {
        if (i % j == 0)
          ct++;
        j++;
      }
      if (ct == 2) {
        System.out.printf("%d ", i);
        n++;
      }
      i++;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number ::");
    int N = sc.nextInt();

    N_primes(N);

    sc.close();
  }
}