package BOSSCODER_Sessions.Session_9_10_11_Searching_14_June;

import java.util.HashSet;
import java.util.Set;

public class MinimumCommonValue {
    public static int findMinCommonValue(int [] nums1, int[] nums2){
      int value = -1;
      Set<Integer> s = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            s.add(nums1[i]);
            // if(s.contains(nums2[i])) {value = nums2[i]; break;}
        }

        for(int i=0;i<nums2.length;i++){
          if(s.contains(nums2[i])) {value = nums2[i]; break;}
        }


      return value;

    }
  public static void main(String[] args) {
    int[] nums1 = {1,2,3};
    int[] nums2 = {2,4};
    System.out.println(findMinCommonValue(nums1, nums2));
  }
}
