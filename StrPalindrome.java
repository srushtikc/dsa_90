package DAY6;

import java.util.Scanner;

public class StrPalindrome {
  public static boolean isPalindrome(int i, String s) {
    s = s.toLowerCase();
    if (i >= s.length() / 2)
      return true;

    if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
      return false;
    } else {
      return isPalindrome(i + 1, s);
    }
  }

  public static void main(String arg[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your String");
    String s = sc.nextLine();
    System.out.println(isPalindrome(0, s));
  }
}
