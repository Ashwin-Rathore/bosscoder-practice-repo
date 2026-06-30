package BOSSCODER_Sessions.Session_13_Sort_27_June;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static int[] mergeSortedArray(int []arr,int []brr){
      int[] newArr = new int[arr.length+brr.length];
      Arrays.toString(arr);
      int min = 0;
      int p1,p2=0;
      for(int i=0;i<newArr.length;i++){
          
          for(int j=0;j<brr.length;j++){
            if(arr[i]<brr[j]) {
              min = arr[i];
              }else{  
                min = arr[j];
              }


          }
          newArr[i] = min;
      }


      return newArr;
    }



  public static void main(String[] args) {
    
    int [] arr = {1,3,5,6};
     int [] brr = {2,4,7,8};
     System.out.println(mergeSortedArray(arr,brr));

     for(int element : mergeSortedArray(arr,brr))
      System.out.println(element+" ");
  }
}
