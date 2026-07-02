package BOSSCODER_Sessions.Session_13_Sort_27_June;

import java.util.Arrays;

public class MaximizeSumOfArrayAfterKNegations {

   public static void print(int [] arr){
      for( int val : arr){
      System.out.print(val+" ");
      }
      System.out.println();
  }
  
   public static int maximumSum(int[] nums, int k){
      int sum = 0;
      Arrays.sort(nums);
      print(nums);
       
      for(int i=0;i<nums.length;i++){
            if(nums[i]<=0 && k>0){
                nums[i] = -(nums[i]);
                k--;
            }
        }
        if(k%2==0){
            for(int val :nums) sum= sum+val;
        }else{
             Arrays.sort(nums);
            nums[0] = -(nums[0]);
            for(int val :nums) sum= sum+val;
        }

      return sum;
    }

   public static void main(String[] args) {
    int[]arr = {-5,-4,2};
    int k = 3;
    System.out.println((maximumSum(arr,k)));
  }
}
