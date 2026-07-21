package Bosscoder_Module_1.BegineerModule.Session_5_1D_Array_24_May;

import java.util.HashMap;

public class MajorityElement {

  static int num;

  static public int majorityElement(int nums[]) {

    HashMap<Integer, Integer> hm = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (hm.containsKey(nums[i])) {
        hm.put(nums[i], hm.get(nums[i]) + 1);
      } else {
        hm.put(nums[i], 1);
      }
    }
    for (int i = 0; i < hm.size(); i++) {
      if (hm.get(nums[i]) > nums.length / 2) {
        num = nums[i];

      }
    }
    System.out.println("------");
    System.out.println(nums.length);
    System.out.println(hm);

    return num;
  }

  public static void main(String[] args) {
    int[] nums = { 3,2,3 };
    int n = majorityElement(nums);
    System.out.println("n -"+n);

  }

}
