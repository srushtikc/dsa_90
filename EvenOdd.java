package DAY2;

public class EvenOdd {
  public static String evenOdd(int n) {
    if ((n & 1) == 0) {
      return "Even";
    } else {
      return "Odd";
    }
  }

  public static void main(String[] args) {
    System.out.println(evenOdd(58461));
  }

}
