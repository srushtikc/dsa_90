package DAY7;

import java.util.*;

public class RemoveEle {
  public static int removeElement(int[] arr, int val) {
    int x = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != val) {
        arr[x] = arr[i];
        x++;
      }
    }
    return x;
  }

  public static void main(String args[]) {
    int[] arr = { 1, 2, 3, 5, 2, 6, 5, 4, 3, 2 };
    int val = 2;

    int n = removeElement(arr, val);
    System.out.println(n);
    for (int j = 0; j < n; j++) {
      System.out.print(arr[j] + " ");
    }
  }

}
