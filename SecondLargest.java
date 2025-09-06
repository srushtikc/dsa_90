package DAY3;

public class SecondLargest {
  public static int second_largest(int arr[], int n) {
    if (n < 2)
      return -1;

    int large = Integer.MIN_VALUE;
    int s_large = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
      if (arr[i] > large) {
        s_large = large;
        large = arr[i];
      } else if (arr[i] > s_large && arr[i] != large) {
        s_large = arr[i];
      }
    }
    return s_large;
  }

  public static void main(String[] args) {
    int arr[] = { 45, 78, 62, 41, 86, 12, 84, 39, 72, 16, 84, 92, 58, 67 };
    int n = arr.length;

    System.out.println("Seconnd largest element from array is " + second_largest(arr, n));
  }

}
