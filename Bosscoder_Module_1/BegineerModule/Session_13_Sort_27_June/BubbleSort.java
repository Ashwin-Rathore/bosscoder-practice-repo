package Bosscoder_Module_1.BegineerModule.Session_13_Sort_27_June;

public class BubbleSort {
  

   static public void print(int[] arr){
      for(int value : arr){
          System.out.print(value+" ");
      }
      System.out.println();

    }

    public static int[] bubbleSortAlgo(int[] arr){
      int len = arr.length;
     for( int i=0;i<len-1;i++){
          
        boolean swapped = false;
          
          for(int j=0;j<len-1-i;j++){
                    if(arr[j]<arr[j+1]){
                         int temp = arr[j];
                         arr[j] = arr[j+1];
                         arr[j+1] = temp;
                    }
          }

     }
      return arr;
    }


  public static void main(String[] args) {
    int [] arr = {2,4,11,6,83,3,1};
    print(arr);
    print(bubbleSortAlgo(arr));
  }

}


