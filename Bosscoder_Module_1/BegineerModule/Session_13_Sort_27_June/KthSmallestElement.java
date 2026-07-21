package Bosscoder_Module_1.BegineerModule.Session_13_Sort_27_June;

import java.util.Arrays;

public class KthSmallestElement {
  
    public static int KthSmallestEle(int[] arr, int k){
      
      Arrays.sort(arr);
      return arr[k];

    }


   public static void main(String[] args) {
    int[] a = { 54,121, 82, 2, 43, 34, 15 };
    int k =3;
   // int[] b = { 1, 2, 3, 6, 7 };
    System.out.println(KthSmallestEle(a,k));
    // System.out.println(SortedArrayUnionUsingTreeSet(a,b));
  }
}
