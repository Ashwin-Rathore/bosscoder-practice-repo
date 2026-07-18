package BOSSCODER_Sessions.Session_5_1D_Array_24_May;

public class WaveyArray {

  public static void print(int[] arr) {
    for (int val : arr) {
      System.out.print(val + " ");
    }
    System.out.println();
  }

    public static int[] findWaveyArray(int [] arr){
      int l = arr.length;

      for(int i=1;i<l;i+=2){
        int temp = arr[i];
        arr[i] = arr[i-1];
        arr[i-1] = temp;
      }


      return arr ;
    }


public static void main(String[] args) {
  
  int[] arr = {2,4,7,8,9};
  print(findWaveyArray(arr));
}  

  
}
