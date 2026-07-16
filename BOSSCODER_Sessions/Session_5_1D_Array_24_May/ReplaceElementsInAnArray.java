package BOSSCODER_Sessions.Session_5_1D_Array_24_May;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ReplaceElementsInAnArray {
  public static void print(int[] arr) {
    for (int val : arr) {
      System.out.print(val + " ");
    }
  }

  public static int[] ReplaceElementsInArray(int[] nums, int[][] operations) {

    HashMap<Integer, Integer> map = new HashMap<>();

    // Build value -> index mapping
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], i);
    }

    // Apply operations
    for (int i = 0; i < operations.length; i++) {

      int oldValue = operations[i][0];
      int newValue = operations[i][1];

      // Find where oldValue exists
      int index = map.get(oldValue);

      // Replace in array
      nums[index] = newValue;

      // Update HashMap
      map.remove(oldValue);
      map.put(newValue, index);
    }

    return nums;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 4, 6 };
    int[][] operations = { { 1, 3 }, { 4, 7 }, { 6, 1 } };

    print(ReplaceElementsInArray(nums, operations));
  }

}
