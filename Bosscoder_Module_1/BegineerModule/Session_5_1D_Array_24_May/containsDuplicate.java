package Bosscoder_Module_1.BegineerModule.Session_5_1D_Array_24_May;

import java.util.Arrays;

public class containsDuplicate {

  static public boolean containsDup(int[] nums){
    boolean flag = false;
      Arrays.sort(nums);

    for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                    if(nums[i]==nums[j]) flag = true;
            }
    }
        return flag;
};

  public static void main(String[] args) {
    
    int [] nums = {1,2,3,1};
    System.out.println(containsDup(nums));

  }
  
}
