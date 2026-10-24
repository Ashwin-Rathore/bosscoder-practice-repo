package Bosscoder_Module_2.Session5_8Aug.Hashing;

import java.util.HashMap;

public class LargestSubarrayWithZerosum {
  public static int subArrayToZero(int[] arr) {
    int sum = 0;
    int max_i = 0;
    HashMap<Integer, Integer> hm = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
      sum = sum + arr[i];
      if (sum == 0)
        max_i = i + 1;
      if (hm.containsKey(sum)) {
        max_i = Math.max(max_i, i - hm.get(sum));
      } else
        hm.put(sum, i);
    }
    return max_i;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 0, -4, 3, 1, 0, -1 };
    System.out.println(subArrayToZero(arr));

  }
}
