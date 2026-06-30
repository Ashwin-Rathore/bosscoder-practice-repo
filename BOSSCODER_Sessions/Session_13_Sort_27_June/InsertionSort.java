package BOSSCODER_Sessions.Session_13_Sort_27_June;

public class InsertionSort {

  public static int[] insertionSortAlgo(int[] arr){

    int len = arr.length;
    for( int i=1;i<len;i++){
        int j =i;
        while(j>0 && arr[j]<arr[j-1]){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            j--;

        }

    }

    return arr;
  }

  public static void print (int[] arr){
    for(int val : arr){
        System.out.print(val+" ");
    }
  }

  public static void main(String[] args) {
    int[] a = { 54,121, 82, 2, 43, 34, 15 };
    
    print(insertionSortAlgo(a));
    
  }
  
}
