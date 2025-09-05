package DAY1;

public class SquareOfN {
  public static int squareOfN(int n) {
    if (n == 0) {
      return 0;
    }

    if (n < 0) {
      n = -n;
    }

    int x = n >> 1;

    if ((n & 1) == 1) {
      return (((int) Math.pow(x, 2) << 2) + (x << 2) + 1);
    } else {
      return ((int) Math.pow(x, 2) << 2);
    }
  }

  public static void main(String[] args) {
    System.out.println(squareOfN(46));

  }

}
