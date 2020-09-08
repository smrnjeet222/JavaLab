// 12.  Write a java program to implement the Vignere cipher. 
//      Use the Key "MELON" to encrypt any sentence and show encryption and decryption.

import java.util.Scanner;

class prog12 {
  public static String encrypt(String text, final String key) {
    String res = "";
    text = text.toUpperCase();
    for (int i = 0, j = 0; i < text.length(); i++) {
      char c = text.charAt(i);
      if (c < 'A' || c > 'Z')
        continue;
      res += (char) ((c + key.charAt(j) - 2 * 'A') % 26 + 'A');
      j = ++j % key.length();
    }
    return res;
  }

  public static String decrypt(String text, final String key) {
    String res = "";
    text = text.toUpperCase();
    for (int i = 0, j = 0; i < text.length(); i++) {
      char c = text.charAt(i);
      if (c < 'A' || c > 'Z')
        continue;
      res += (char) ((c - key.charAt(j) + 26) % 26 + 'A');
      j = ++j % key.length();
    }
    return res;
  }

  public static void main(final String[] args) {
    Scanner sc = new Scanner(System.in);
    String key = "MELON";

    System.out.println("Enter Message to encode");
    String message = sc.nextLine();
    String encryptedMsg = encrypt(message, key);

    System.out.println("String: " + message);

    System.out.println("Encrypted message: " + encryptedMsg);
    System.out.println("Decrypted message: " + decrypt(encryptedMsg, key));

    sc.close();
  }
}
