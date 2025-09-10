package DAY7;

import java.util.Arrays;

public class IsArrSorted {
  public static boolean isSorted(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < arr[i - 1]) {
        return false;
      }
    }
    return true;
  }

  public static void main(String args[]) {
    int[] nums = { 1, 2, 8, 9, 45, 86, 98 };
    System.out.println("Is " + Arrays.toString(nums) + " sorted?");
    System.out.print(isSorted(nums));

  }

}
