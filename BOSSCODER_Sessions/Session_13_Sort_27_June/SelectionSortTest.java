package BOSSCODER_Sessions.Session_13_Sort_27_June;

public class SelectionSortTest {
  static public void print(int[] arr){
      for(int value : arr){
          System.out.print(value+" ");
      }
      System.out.println();

    }

    public static int[] SelectionSortTestMethod(int [] arr){
      int n = arr.length;
      // for(int i =0;i<n-1;i++){ 
      //     int min = i;
      //     for(int j=i;j<n;j++){
      //         if(arr[j]>arr[min]){
      //             min =j;
      //         }
      //     }
      //     int temp = arr[i];
      //     arr[i] = arr[min];
      //     arr[min] = temp;
      // }
    // return arr;

     int len = arr.length;
     
     for(int i=0;i<len-1;i++){
          int mindex = i;
          for(int j=i;j<len;j++){
                    if(arr[j]<arr[mindex]){
                         mindex = j;
                    }

          }
               int temp = arr[i];
               arr[i] = arr[mindex];
               arr[mindex] = temp;

     
     }

     return arr;
    }


  public static void main(String[] args) {
    int [] arr = {2,4,11,6,83,3,1};
    print(arr);
    print(SelectionSortTestMethod(arr));
  }
  
}
