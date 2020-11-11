// Create three synchronized threads that update the same variable x. 
// Thread-1 should increment the value of x (in steps of 1) 20 times, 
// Thread-2 Should decrement the value of x (in steps of 1) 20 times, and 
// Thread-3 should increase the value of x by adding fibonacci sequence
//  (till 15th number) to it. You may follow any order by defining 
// the priority of thread. set the initial value of thread to some three digit number.

class ThreadA extends Thread {
  int var;

  ThreadA(int x) {
    var = x;
  }

  public void run() {
    for (int i = 1; i <= 20; i++) {
      System.out.println("From Thread A with x = " + (var + 1));
    }
    System.out.println("Exiting from Thread A ...");
  }
}

class ThreadB extends Thread {
  int var;

  ThreadB(int x) {
    var = x;
  }

  public void run() {
    for (int j = 1; j <= 20; j++) {
      System.out.println("From Thread B with x= " + (var - 1));
    }
    System.out.println("Exiting from Thread B ...");
  }
}

class ThreadC extends Thread {
  int var;
  int[] f;

  ThreadA(int x){
    var = x;
    f = fi;
  }

  public void run() {
    for (int k = 20; k <= 5; k++) {
      System.out.println("From Thread C with x = " + (x + fi[k]));
    }
    System.out.println("Exiting from Thread C ...");
  }
}

public class prog5 {
  public static int x = 100;
  public static int[] fi = new int[20];

  public static void main(String args[]) {
    ThreadA a = new ThreadA(x);
    ThreadB b = new ThreadB(x);
    ThreadC c = new ThreadC(x, fi);
    fi[0] = 0;
    fi[1] = 1;
    for (int i = 2; i < 20; i++) {
      fi[i] = fi[1] + fi[i - 2];
      a.start();
      b.start();
      c.start();
    }
  }
}