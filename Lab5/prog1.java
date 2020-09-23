
// Q1.  Write a program to create a Virtual Directory Service that contains the following information.
// (a) Name of a person
// (b) Address
// (c) Telephone Number (if available with STD code)
// (d) Mobile Number (if available)
// (e) Email Address
// (f) Unique ID No.
// The program will support the following menu based activities:
// (a) Create an entry (The Unique ID number must be unique for every entry)
// (b) Edit an entry (Must be identified by only the Unique ID number)
// (c) Search by keyword (Any keyword may not be complete; even if the keyword matches
//  partially with any field, the corresponding information must be displayed)
//  Note: Do not use FILE to store.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class VirtualDirectoryService {
  int id;
  String name;
  String address;
  String telno;
  String mobileno;
  String email;
  static int count = 0;

  public VirtualDirectoryService(String name, String address, String email) {
    id = count;
    this.name = name;
    this.address = address;
    this.email = email;
    count++;
  }

  public VirtualDirectoryService(String name, String address, String email, String mobileno) {
    id = count;
    this.name = name;
    this.address = address;
    this.email = email;
    this.mobileno = mobileno;
    count++;
  }

  public VirtualDirectoryService(String name, String address, String email, String mobileno, String telno) {
    id = count;
    this.name = name;
    this.address = address;
    this.email = email;
    this.telno = telno;
    this.mobileno = mobileno;
    count++;
  }

  public void print() {
    System.out.println();
    System.out.println("id : " + id);
    System.out.println("name : " + name);
    System.out.println("email : " + email);
    System.out.println("address : " + address);
    if (mobileno != null) {
      System.out.println("mobile number : " + mobileno);
    }
    if (telno != null) {
      System.out.println("telephone number : " + telno);
    }
  }

  public void update(int field, String val) {
    System.out.println();
    switch (field) {
      case 0:
        name = val;
        break;
      case 1:
        address = val;
        break;
      case 2:
        email = val;
        break;
      case 3:
        mobileno = val;
        break;
      case 4:
        telno = val;
        break;
      default:
        System.out.println("invalid field");
        return;
    }
    System.out.println("updated successful");
  }

  public void find(String val) {
    System.out.println();
    Pattern pattern = Pattern.compile(val, Pattern.CASE_INSENSITIVE);

    Matcher matcher = pattern.matcher(name);
    boolean matchFound = matcher.find();
    if (matchFound == true) {
      print();
      return;
    }
    matcher = pattern.matcher(address);
    matchFound = matcher.find();
    if (matchFound == true) {
      print();
      return;
    }
    matcher = pattern.matcher(email);
    matchFound = matcher.find();
    if (matchFound == true) {
      print();
      return;
    }
    if (mobileno != null) {
      matcher = pattern.matcher(mobileno);
      matchFound = matcher.find();
      if (matchFound == true) {
        print();
        return;
      }
    }
    if (telno != null) {
      matcher = pattern.matcher(telno);
      matchFound = matcher.find();
      if (matchFound == true) {
        print();
        return;
      }
    }
  }

}

public class prog1 {
  public static void search(String val, VirtualDirectoryService[] dic) {
    for (int i = 0; i < 50; i++) {
      if (dic[i] == null) {
        return;
      }
      dic[i].find(val);
    }
  }

  public static void main(String[] args) {

    VirtualDirectoryService[] dic = new VirtualDirectoryService[50];
    dic[0] = new VirtualDirectoryService("John", "123abc", "abc@def.com", "123456789", "01691-12345");
    dic[1] = new VirtualDirectoryService("Kon", "456def", "mno@gmail.com", "987654321");
    dic[2] = new VirtualDirectoryService("Phon", "789ghi", "cde@gmail.com");

    if (dic[1] == null) {
      System.out.println("Empty entry");
    } else {
      dic[1].print();
    }

    if (dic[1] == null) {
      System.out.println("Empty entry");
    } else {
      dic[1].update(4, "2787654");
    }
    search("on", dic);
  }

}
