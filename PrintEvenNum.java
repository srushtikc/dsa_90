package DAY4;

import java.util.Arrays;

public class PrintEvenNum {
  public static String evenNumbers(int[] arr) {
    StringBuilder sb = new StringBuilder();
    for (int num : arr) {
      if (num % 2 == 0) {
        sb.append(num).append(" ");
      }
    }
    return sb.toString().trim();
  }

  public static void main(String[] args) {
    int[] nums = { 45, 86, 91, 76, -7, 9, -42, 84, 73, -45, 9 };
    System.out.println("Even numbers in array " + Arrays.toString(nums) + " are: " + evenNumbers(nums));

  }

}
