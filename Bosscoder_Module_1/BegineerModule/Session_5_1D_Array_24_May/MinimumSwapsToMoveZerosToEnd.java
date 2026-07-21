package Bosscoder_Module_1.BegineerModule.Session_5_1D_Array_24_May;

public class MinimumSwapsToMoveZerosToEnd {
  
    public static int minSwap(int[] nums){
        int i =0;
        int j = nums.length-1;
        int count =0;
        while(i<j){
            if(nums[j]==0) j--;
            if(nums[i]==0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                count++;
                j--;
            }
                i++;
                
        }
      return count;
    }
  public static void main(String[] args) {
    
    int[] nums = {1,2,0};
    System.out.println(minSwap(nums ));

  }
}
