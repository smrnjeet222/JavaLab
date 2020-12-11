// Write a Menu Driven Program in Java to perform following operations:
// 1. Take input from user to store record into a File
// 2. Read from the File the contents and display them on screen
// 3. Update a particular record.

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.NumberFormatException;

class AddFriend {
    public static void main(String data[]) {
        try {

            String newName = data[0];

            long newNumber = Long.parseLong(data[1]);

            String nameNumberString;
            String name;
            long number;
            int index;

            File file = new File("friendsContact.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            boolean found = false;

            while (raf.getFilePointer() < raf.length()) {

                nameNumberString = raf.readLine();

                index = nameNumberString.indexOf('!');

                name = nameNumberString.substring(0, index);
                number = Long.parseLong(nameNumberString.substring(index + 1));

                if (name == newName || number == newNumber) {
                    found = true;
                    break;
                }
            }

            if (found == false) {

                nameNumberString = newName + "!" + String.valueOf(newNumber);

                raf.writeBytes(nameNumberString);

                raf.writeBytes(System.lineSeparator());

                System.out.println(" Friend added. ");
                raf.close();
            } else {

                raf.close();

                System.out.println(" Input name" + " does not exists. ");
            }
        }

        catch (IOException ioe) {

            System.out.println(ioe);
        } catch (NumberFormatException nef) {

            System.out.println(nef);
        }
    }
}

class DisplayFriends {
    public static void main(String data[]) { 
        try { 

            String nameNumberString; 
            String name; 
            long number; 
            int index; 

            File file = new File("friendsContact.txt"); 

            if (!file.exists()) { 

                file.createNewFile(); 
            } 


            RandomAccessFile raf = new RandomAccessFile(file, "rw"); 
            boolean found = false; 

            while (raf.getFilePointer() < raf.length()) { 
                nameNumberString = raf.readLine(); 

                index = nameNumberString.indexOf('!'); 

                name = nameNumberString .substring(0, index); 
                number = Long .parseLong( nameNumberString .substring(index + 1)); 

                System.out.println("Friend Name: "+ name + "\n"+ "Contact Number: "+ number + "\n"); 
            } 

            catch (IOException ioe) { 
                System.out.println(ioe); 
            } 
            catch (NumberFormatException nef) { 
                System.out.println(nef); 
            } 
        } 
    }
}

class UpdateFriend {
    public static void main(String data[]) {
        try {

            String newName = data[0];

            long newNumber = Long.parseLong(data[1]);

            String nameNumberString;
            String name;
            long number;
            int index;

            File file = new File("friendsContact.txt");

            if (!file.exists()) {

                file.createNewFile();
            }

            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            boolean found = false;

            while (raf.getFilePointer() < raf.length()) {

                nameNumberString = raf.readLine();

                index = nameNumberString.indexOf('!');

                name = nameNumberString.substring(0, index);
                number = Long.parseLong(nameNumberString.substring(index + 1));

                if (name == newName || number == newNumber) {
                    found = true;
                    break;
                }
            }

            if (found == true) {

                File tmpFile = new File("temp.txt");

                RandomAccessFile tmpraf = new RandomAccessFile(tmpFile, "rw");

                raf.seek(0);

                while (raf.getFilePointer() < raf.length()) {

                    nameNumberString = raf.readLine();

                    index = nameNumberString.indexOf('!');
                    name = nameNumberString.substring(0, index);

                    if (name.equals(inputName)) {

                        nameNumberString = name + "!" + String.valueOf(newNumber);
                    }

                    tmpraf.writeBytes(nameNumberString);

                    tmpraf.writeBytes(System.lineSeparator());
                }

                raf.seek(0);
                tmpraf.seek(0);

                while (tmpraf.getFilePointer() < tmpraf.length()) {
                    raf.writeBytes(tmpraf.readLine());
                    raf.writeBytes(System.lineSeparator());
                }

                raf.setLength(tmpraf.length());

                tmpraf.close();
                raf.close();

                tmpFile.delete();

                System.out.println(" Friend updated. ");
            }

            else {
                raf.close();
                System.out.println(" Input name" + " does not exists. ");
            }
        }

        catch (IOException ioe) {
            System.out.println(ioe);
        }

        catch (NumberFormatException nef) {
            System.out.println(nef);
        }
    }
}
