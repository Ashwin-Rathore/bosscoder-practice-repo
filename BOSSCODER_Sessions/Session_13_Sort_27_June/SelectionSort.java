package BOSSCODER_Sessions.Session_13_Sort_27_June;

public class SelectionSort {
  
  public static int[] SelectionSortElement(int[] arr){
      int n = arr.length;
      for(int i=0;i<n;i++){
          int swapElement = 0;
          for( int j=0;j<n;j++){
              int temp = arr[j];
              for(int k=j+1;k<n;k++){
                if(temp>arr[k]){
                    temp = arr[k];
                }

              }
                int finalTemp = temp;
                temp = arr[j];
                arr[j] = finalTemp;


          }


      }

    return arr;
  }



static public void print(int[] arr){
      for(int value : arr){
          System.out.print(value+" ");
      }
      System.out.println();



  }
  public static void main(String[] args) {
     int [] arr = {2,4,11,6,83,3,1};
    print(arr);
    print(SelectionSortElement(arr));
  }
  }

