package BOSSCODER_Sessions.Session_13_Sort_27_June;

public class AlternativeSorting {
  
  public static int[] bubbleSortInIncreasingOrder(int[] arr){
      int len = arr.length;
     for( int i=1;i<len-1;i+=2){
          
        boolean swapped = false;
          
          for(int j=1;j<len-1-i;j++){
                    if(arr[j]>arr[j+2]){
                         int temp = arr[j];
                         arr[j] = arr[j+2];
                         arr[j+2] = temp;
                    }
          }

     }
      return arr;
    }

  public static int[] bubbleSortInDescreasingOrder(int[] arr){
      int len = arr.length;
     for( int i=0;i<len-1;i+=2){
          
        boolean swapped = false;
          
          for(int j=0;j<len-1-i;j+=2){
                    if(arr[j]<arr[j+2]){
                         int temp = arr[j];
                         arr[j] = arr[j+2];
                         arr[j+2] = temp;
                    }
          }

     }
      return arr;
    }

  public static void print(int [] arr){
      for( int val : arr){
      System.out.print(val+" ");
      }
  }

  public static int[] sortAlternateinArray(int[] arr){
      
      bubbleSortInIncreasingOrder(arr);
      bubbleSortInDescreasingOrder(arr);

    return arr;
  }

    public static void main(String[] args) {
       int n = 7;
       int arr[] = {7, 1, 2, 3, 4, 5, 6};
       print(sortAlternateinArray(arr));

    }
}
