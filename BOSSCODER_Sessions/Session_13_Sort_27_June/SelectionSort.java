package BOSSCODER_Sessions.Session_13_Sort_27_June;

public class SelectionSort {
  
  public static int[] SelectionSortElement(int[] arr){
      int n = arr.length;

    //   for( int i=0;i<n-1;i++){
    //         int minIndex = i;
    //       for( int j =i+1;j<n;j++){
    //           if(arr[j]>arr[minIndex]){
    //               minIndex = j;
    //           }
    //         }
    //       int temp = arr[minIndex];
    //       arr[minIndex] = arr[i];
    //       arr[i] = temp;
    //       //    print(arr);
          //   }

            for(int i=1;i<n-1;i+=2){
              int mindex = i;
              for(int j=i+1;j<n;j+=2){
                if(arr[j]>arr[mindex]){
                        mindex = j;
                }
            }
              int temp = arr[mindex];
              arr[mindex] = arr[i];
              arr[i] = temp;
            
            }

            for(int i=0;i<n-1;i+=2){
              int mindex = i;
              for(int j=i+1;j<n;j+=2){
                if(arr[j]<arr[mindex]){
                        mindex = j;
                }
            }
              int temp = arr[mindex];
              arr[mindex] = arr[i];
              arr[i] = temp;
            
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

