package DAY4;

import java.util.Arrays;

public class NegativeNumbers {
  public static int negativeNumbers(int[] arr) {
    int count = 0;
    for (int num : arr) {
      if (num < 0) {
        count++;
      }
    }
    return count;

  }

  public static void main(String args[]) {
    int[] array = { 45, -4, 96, -8, 4, 96, -78, -11, 84, 17, -26, 83, -49 };
    System.out.println("No. of negative numbers in array " + Arrays.toString(array) + " is " + negativeNumbers(array));
  }

}
