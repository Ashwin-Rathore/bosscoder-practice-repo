package Bosscoder_Module_2.Session5_8Aug.Hashing;

import java.util.HashMap;

public class MaxSumSubarrayOfSizeK {

  public static int maxSumArray(int[] arr, int k ) {
    int start = 0;
    int end =0;
    int sum = 0;
    int ans = 0;
  
    while (end<arr.length){
      sum = sum+arr[end];
      if(end-start+1==k){
        ans = Math.max(ans, sum);
        sum = sum-arr[start];
        start++;
      }
      end++;
    }

    return ans;
  }

  public static void main(String[] args) {
  int arr[] = { 1, 4, 2, 10, 23, 3, 1, 0, 20 };
  int k = 4;
    System.out.println(maxSumArray(arr,k));


}
}
