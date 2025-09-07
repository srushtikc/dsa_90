package DAY4;

public class CountDigit {
  public static int countDigit(int n) {
    int count = 0;
    n = Math.abs(n);
    while (n > 0) {
      n = n / 10;
      count++;
    }
    return count;
  }

  public static void main(String arg[]) {
    int n = 478564669;

    System.out.println("The number of digits in " + n + " are " + countDigit(n));

  }

}
