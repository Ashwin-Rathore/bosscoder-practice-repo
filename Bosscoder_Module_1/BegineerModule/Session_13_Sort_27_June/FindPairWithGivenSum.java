package Bosscoder_Module_1.BegineerModule.Session_13_Sort_27_June;

import java.net.SocketTimeoutException;
import java.util.Arrays;

public class FindPairWithGivenSum {
  
  public static boolean findPair(int[] arr,int target){
    int num = 0;

    Arrays.sort(arr);
    int lo = 0;
    int hi = arr.length-1;
    while(lo<hi){
      int mid = hi - (hi-lo)/2;
      if(arr[hi]+arr[lo] == target) return true;
      else if(arr[hi]+arr[lo] > target){
          hi--;
      }else lo++;
    }
    

    return false;
  }


  public static void main(String[] args) {
    int [] arr = {7,0,4,3,2,8,10};
    int target = 9;
    System.out.println(findPair(arr,target));
  }
}
