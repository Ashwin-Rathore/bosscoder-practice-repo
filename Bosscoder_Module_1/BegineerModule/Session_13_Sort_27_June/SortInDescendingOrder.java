package Bosscoder_Module_1.BegineerModule.Session_13_Sort_27_June;

public class SortInDescendingOrder {

  static public void print(int[] arr){
      for(int value : arr){
          System.out.print(value+" ");
      }
      System.out.println();
  }

  static public int[] SortInDescending(int [] arr){
      int n = arr.length-1;
      int swapCount = 0;
      for( int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                if( arr[j]< arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swapCount++;
                }
            }
            if(swapCount == 0) break;
      }

      return arr;
  }

  public static void main(String[] args) {
    int [] arr = {2,4,11,6,83,3,1};
    print(arr);
    print(SortInDescending(arr));
  }

}
