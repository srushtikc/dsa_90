package DAY1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

  public static int[] twoSum(int arr[], int n, int target) {
    HashMap<Integer, Integer> Map = new HashMap<>();

    int ans[] = new int[2];
    ans[0] = -1;
    ans[1] = -1;

    for (int i = 0; i < n; i++) {
      int num = arr[i];
      int req = target - num;

      if (Map.containsKey(req)) {
        ans[0] = Map.get(req);
        ans[1] = i;

        return ans;
      }

      Map.put(arr[i], i);

    }
    return ans;
  }

  public static void main(String[] args) {
    int[] nums = { 4, 8, 4, 5, 6, 8, 7 };
    int[] result = twoSum(nums, nums.length, 21);

    System.out.println(Arrays.toString(result));

  }

}
