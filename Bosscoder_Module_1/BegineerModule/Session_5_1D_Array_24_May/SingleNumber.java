package Bosscoder_Module_1.BegineerModule.Session_5_1D_Array_24_May;

import java.util.HashMap;

public class SingleNumber {
  static int num;
  static public int singleNumber(int[] nums) {
   
    if (nums.length < 2)
      return nums[0];

    HashMap<Integer, Integer> hm = new HashMap<>();
   
    for (int i = 0; i < nums.length; i++) {
        if(hm.containsKey(nums[i])) {
         hm.put(nums[i], hm.get(nums[i])+1);
         }
          else
              {  hm.put(nums[i], 1);
               }

         
      
  }
   for (int i = 0; i < nums.length; i++){
              if(hm.get(nums[i])==1){
              num = nums[i];
               }
   }
  System.out.println(hm);
        return num;
      
  }

  public static void main(String[] args) {

    int[] nums = { 4,1,2,1,2 };
    System.out.println(singleNumber(nums));
  }

}
