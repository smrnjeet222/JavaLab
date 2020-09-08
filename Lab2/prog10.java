// 10.Write a program to implement the concept of Queue.

class QueueArr {
  public int i, front, rear, item, max;
  public int a[];

  QueueArr(int size) {
    a = new int[size];
    front = -1;
    rear = -1;
    max = size;
  }

  public void insert(int item) {
    if (rear >= max) {
      System.out.println("Queue is Full");
    } else {
      rear = rear + 1;
      a[rear] = item;
      System.out.println("Inserting " + item);
    }
  }

  public void delete() {
    if (front == -1) {
      System.out.println("Queue is Empty");
    } else {
      front = front + 1;
      item = a[front];
      System.out.println("Deleted Item: " + item);
    }
  }

  public void display() {
    System.out.println("Elements in the Queue are:");
    for (int i = front + 1; i <= rear; i++) {
      System.out.printf("%d ", a[i]);
    }
  }
}

public class prog10 {

  public static void main(String args[]) {

    QueueArr q = new QueueArr(3);

    q.insert(2);
    q.insert(5);

    q.delete();
    q.delete();

    q.insert(3);

    q.delete();

    q.display();

  }

}
