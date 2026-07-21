package Bosscoder_Module_1.BegineerModule.Session_5_1D_Array_24_May;

public class MaximumProductOfTwoElements {

    static public int multiple(int[] nums){
      int firstMax = nums[0];
     int secondMax = nums[1];
          int maxProduct = 1;
          for(int i=1;i<nums.length;i++){

                    if(nums[i]>firstMax){
                        secondMax = firstMax;
                        firstMax = nums[i];
                    }else if(nums[i]>secondMax){
                      secondMax = nums[i];
                    }
          }
               maxProduct = ( firstMax-1) * (secondMax-1);
 return maxProduct;
    }

  public static void main(String[] args) {
    
        int[]  nums = {3,1,5,8};
      System.out.println(multiple(nums));

  }
  
}
