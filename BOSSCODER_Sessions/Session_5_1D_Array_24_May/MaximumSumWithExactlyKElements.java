package BOSSCODER_Sessions.Session_5_1D_Array_24_May;

public class MaximumSumWithExactlyKElements {


  static public int solve(int []nums, int k){
  int maxSum =0;
  
  for(int i=0;i<k;i++){
      int maxNum = nums[0];
      int index = 0;
      
      for(int j=1;j<nums.length;j++){
          if(maxNum<nums[j]){
            maxNum = nums[j];
            index = j;
          }
      }
      maxSum = maxSum+maxNum;
      nums[index] = maxNum+1;


  }
    return maxSum;
};
  public static void main(String[] args) {
    
//int[] nums = {1,2,3,4,5};
int[] nums = {5,5,5};
int k = 2;



System.out.println(solve(nums,k));

  }
  
}
