package Bosscoder_Module_1.BegineerModule.Session_13_Sort_27_June;

import java.util.Arrays;

public class MinimumDifferencePair {

   public static void print(int [] arr){
      for( int val : arr){
      System.out.print(val+" ");
      }
      System.out.println();
  }

  public static int minDiff(int[] arr){
    int num=Integer.MAX_VALUE;
    Arrays.sort(arr);
    print(arr);
    for( int i=1;i<arr.length;i++){
        if(arr[i]-arr[i-1]<num) num = arr[i]-arr[i-1];
    }
    return num;
  }



   public static void main(String[] args) {
       
       int arr[] = {3, 10, 8, 6};
       System.out.println(minDiff(arr));

    }
}

