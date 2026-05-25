package BOSSCODER_Sessions.Session_5_1D_Array_24_May;

public class LeftAndRightSumDifferences {

    static public int[] leftRightSum(int []nums){
      int [] sumArray = new int[nums.length];
      int[] leftSum = new int[nums.length];
      int[] rightSum = new int[nums.length];
       
        leftSum[0] = 0;
        rightSum[nums.length-1] = 0;
        int sum1 =0;
      for(int i=1;i<nums.length;i++){
           
        sum1 = sum1+nums[i-1];
        leftSum[i] = sum1;
      }
       int sum2 =0; 
      for(int j=nums.length-2;j>=0;j--){
         
        sum2 = sum2+nums[j+1];
        rightSum[j] = sum2;
      }
      for(int i=0;i<leftSum.length;i++){
        System.out.print(leftSum[i]+" ");
      }
      System.out.println();
      for(int i=0;i<rightSum.length;i++){
        System.out.print(rightSum[i]+" ");
      }
        System.out.println();
      for(int i=0;i<nums.length;i++){
        sumArray[i] = Math.abs(leftSum[i]-rightSum[i]);
      }
        System.out.println();

      return sumArray;
    }

  public static void main(String[] args) {
    
    int [] nums1 = {10,4,8,3};
      int[] newArr =  leftRightSum(nums1);
      for(int i=0;i<newArr.length;i++){
        System.out.print(newArr[i]+" ");
      }
  }
}
