package DAY6;

import java.util.Scanner;

public class NumPalindrome {
  public static boolean isPalindrome(int n) {
    int dup = n;
    int rev = 0;
    while (n > 0) {
      int lastDigit = n % 10;
      rev = (rev * 10) + lastDigit;
      n /= 10;
    }

    if (dup == rev) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.print(isPalindrome(n));
  }

}
