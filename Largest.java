package DAY3;

public class Largest {
  public static int largest(int[] arr, int n) {
    int max = arr[0];
    for (int i = 0; i < n; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }

  public static void main(String[] args) {
    int[] arr = { 42, 8, 74, 21, 96, 87, 45, 62, 45 };
    int n = arr.length;

    System.out.println("Largest element from array is " + largest(arr, n));
  }
}
