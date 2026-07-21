package Bosscoder_Module_1.BegineerModule.Session_9_10_11_Searching_14_June;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KthMissingPositiveNumber {
    public static int missingKthElement(int[] arr,int k){
      int value = -1;
      List<Integer> list = new ArrayList<>();
      for(int i=1;i<=20;i++){
        list.add(i);
      }
      System.out.println(list);
      for(int i=0;i<arr.length;i++) {
        if(list.contains(arr[i])) 
          {
            list.remove((Integer) arr[i]);
      }
    }
      System.out.println(list);
      value = list.get(k-1);
      

      return value;
    }
  public static void main(String[] args) {
    
    int[] arr = {2,3,4,7,11};
    int k = 5;
    System.out.println(missingKthElement(arr,k));
  }
}
