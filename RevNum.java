package DAY6;

import java.util.*;

public class RevNum {
  public static int reverseNumber(int n) {
    int rev = 0;
    while (n > 0) {
      int lastDigit = n % 10;
      rev = (rev * 10) + lastDigit;
      n = n / 10;
    }
    return rev;

  }

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    int n=sc.nextInt();
    System.out.println(reverseNumber(n));
  }

}
