package Bosscoder_Module_2.Session5_8Aug.Hashing;

import java.util.HashMap;

public class ZeroSumSubarray {

  public static boolean subArrayToZero(int[] arr){
    int sum =0;
    int counter = 0;
    HashMap<Integer,Integer> hm = new HashMap<>();
    
    for(int i=0;i<arr.length;i++){
      sum =+ arr[i];
      if(sum==0) return true;
      if(hm.containsKey(sum)) return true;
      hm.put(sum, counter++);
    }
    return false;
  }

  public static void main(String[] args) {
    int arr[] = {4, 2, -3, 1, 0};
    System.out.println(subArrayToZero(arr));

  }
  
}
