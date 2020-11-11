// Write a java application that shows thread priorities.

public class prog3 extends Thread {

  public void run() {
    System.out.println("running thread name is:" + Thread.currentThread().getName());
    System.out.println("running thread priority is:" + Thread.currentThread().getPriority());

  }

  public static void main(String args[]) {
    p3 m1 = new p3();
    p3 m2 = new p3();
    m1.setPriority(Thread.MIN_PRIORITY);
    m2.setPriority(Thread.MAX_PRIORITY);
    m1.start();
    m2.start();

  }
}
