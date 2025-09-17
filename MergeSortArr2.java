package Day10;

import java.util.Arrays;

public class MergeSortArr2 {
  public static void swapGreater(long[] arr1, long[] arr2, int idx1, int idx2) {
    if (arr1[idx1] > arr2[idx2]) {
      long temp = arr1[idx1];
      arr1[idx1] = arr2[idx2];
      arr2[idx2] = temp;
    }
  }

  public static void mergeSortArr(long[] arr1, long[] arr2, int n, int m) {
    int len = n + m;
    int gap = (len / 2) + (len % 2);

    while (gap > 0) {
      int left = 0;
      int right = left + gap;

      while (right < len) {
        if (left < n && right >= n) { // case1
          swapGreater(arr1, arr2, left, right - n);
        } else if (left >= n) { // case2
          swapGreater(arr2, arr2, left - n, right - n);
        } else { // case3
          swapGreater(arr1, arr1, left, right);
        }

        left++;
        right++;
      }
      if (gap == 1)
        break;
      gap = (gap / 2) + (gap % 2);

    }
    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr2));
  }

  public static void main(String[] args) {
    long[] arr1 = { 2, 5, 8, 10 };
    long[] arr2 = { 4, 6, 9, 13 };

    mergeSortArr(arr1, arr2, arr1.length, arr2.length);
  }

}
