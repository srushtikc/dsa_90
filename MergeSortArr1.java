package Day10;

import java.util.Arrays;

public class MergeSortArr1 {
  public static void mergeSortArr(int[] arr1, int[] arr2, int n, int m) {
    int left = n - 1;
    int right = 0;

    while (left >= 0 && right < m) {
      if (arr1[left] > arr2[right]) {
        int temp = arr1[left];
        arr1[left] = arr2[right];
        arr2[right] = temp;
        left--;
        right++;
      } else {
        break;
      }
    }

    Arrays.sort(arr1);
    Arrays.sort(arr2);
    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr2));

  }

  public static void main(String args[]) {
    int[] nums1 = { 1, 2, 5, 7, 10 };
    int[] nums2 = { 3, 5, 8, 9, 12 };

    mergeSortArr(nums1, nums2, nums1.length, nums2.length);
  }

}
