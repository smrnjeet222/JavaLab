// Write a class intList which accepts user input to add list elements in an array. The function
// getsize should return the current number of elements in the list and the function toString
// should display the list elements along with indices. This is a list of unsorted elements. Now
// derive a class sortedIntList from intList which will contain list of sorted elements(smallest
// to larges) from intlist class. This means that when an element is inserted into a sortedIntList
// it should be put into its sorted place, not just at the end of the array

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class intList {
  protected ArrayList<Integer> list;

  intList() {
    this.list = new ArrayList<Integer>();
  }

  void add(int num) {
    this.list.add(num);
  }

  int getSize() {
    return this.list.size();
  }

  void tostring() {
    Iterator<Integer> it = list.iterator();
    int i = 0;
    while (it.hasNext()) {
      System.out.print("[" + i + " : " + it.next() + "], ");
      i++;
    }
  }
}

class sortedList extends intList {
  sortedList() {
    super();
  }

  @Override
  void add(int num) {
    super.add(num);
    Collections.sort(list);
  }
}

public class prog4 {
  public static void main(String[] args) {
    intList l = new intList();
    for (int i = 0; i < 8; i++) {
      l.add(8 - i);
    }
    System.out.println("\nUnsorted List");
    System.out.println("Size of unsorted list : " + l.getSize());
    System.out.print("All elements are : ");
    l.tostring();

    System.out.println(" ");

    sortedList s = new sortedList();
    for (int i = 0; i < 8; i++) {
      s.add(8 - i);
    }
    System.out.println("\nSorted List");
    System.out.println("Size of unsorted list: " + s.getSize());
    System.out.print("All elements are : ");
    s.tostring();

    System.out.println(" ");

  }
}
