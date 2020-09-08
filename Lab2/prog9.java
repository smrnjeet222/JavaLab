// 9.Create a java program to implement the concept of Stack without using Stack Class.

class Stack {
  private final int arr[];
  private int top;
  private final int capacity;

  Stack(final int size) {
    arr = new int[size];
    capacity = size;
    top = -1;
  }

  public void push(final int x) {
    if (isFull()) {
      System.out.println("OverFlow\nProgram Terminated\n");
      System.exit(1);
    }

    System.out.println("Inserting " + x);
    arr[++top] = x;
  }

  public int pop() {

    if (isEmpty()) {
      System.out.println("UnderFlow\nProgram Terminated");
      System.exit(1);
    }

    System.out.println("Removing " + peek());

    return arr[top--];
  }

  public int peek() {
    if (!isEmpty())
      return arr[top];
    else
      System.exit(1);

    return -1;
  }

  public int size() {
    return top + 1;
  }

  public Boolean isEmpty() {
    return top == -1;
  }

  public Boolean isFull() {
    return top == capacity - 1;
  }

  public void display() {
    if (isEmpty()) {
      System.out.println("Elements in the Stack are:");
      System.out.println("Stack Is Empty");
    } else {
      for (int i = top; i < capacity; i++) {
        System.out.println(arr[i]);
      }
    }
  }

}

class prog9 {
  public static void main(final String[] args) {
    final Stack stack = new Stack(3);

    stack.push(1);
    stack.push(2);

    stack.pop();
    stack.pop();

    stack.push(3);

    stack.display();

    System.out.println("Top element is: " + stack.peek());
    System.out.println("Stack size is " + stack.size());

    stack.pop();

    stack.display();

  }

}