// Write an application that executes two threads. 
// One thread displays “A” every 1000 milliseconds and
//  other displays “B” every 3000 milliseconds. 
// Create the threads by extending the Thread class.

class ThreadExample extends Thread {
  ThreadExample(String s) {
    super(s);
    start();
  }

  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println(Thread.currentThread().getName());
      try {
        if (Thread.currentThread().getName() == "A") {
          Thread.sleep(1000);
        } else {
          Thread.sleep(3000);
        }
      } catch (Exception e) {
      }
    }
  }
}

class prog1 {
  public static void main(String arg[]) {
    System.out.println("Thread name:" + Thread.currentThread().getName());
    ThreadExample t1 = new ThreadExample("A");
    ThreadExample t2 = new ThreadExample("B");
  }
}
