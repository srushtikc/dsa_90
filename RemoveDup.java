package DAY7;

import java.util.Arrays;

public class RemoveDup {
  public static int removeDuplicates(int[] arr) {
    int i = 0;
    for (int j = 1; j < arr.length; j++) {
      if (arr[j] != arr[i]) {
        i++;
        arr[i] = arr[j];
      }
    }
    return i + 1;
  }

  public static void main(String args[]) {
    int[] arr = { 1, 25, 25, 45, 45, 62, };
    int n = removeDuplicates(arr);

    for (int k = 0; k < n; k++) {
      System.out.print(arr[k] + " ");
    }

  }

}
