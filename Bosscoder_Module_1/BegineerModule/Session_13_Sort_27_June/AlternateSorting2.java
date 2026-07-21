package Bosscoder_Module_1.BegineerModule.Session_13_Sort_27_June;

public class AlternateSorting2 {
  

  public static void print(int [] arr){
      for( int val : arr){
      System.out.print(val+" ");
      }
      System.out.println();
  }

  public static int[] bubbleSort(int[] arr){
      int len = arr.length;
     for( int i=0;i<len-1;i++){
          
        boolean swapped = false;
          
          for(int j=0;j<len-1-i;j++){
                    if(arr[j]>arr[j+1]){
                         int temp = arr[j];
                         arr[j] = arr[j+1];
                         arr[j+1] = temp;
                    }
          }

     }
      return arr;
    }

  public static int[] sortAlternateinArray(int[] arr){
      int [] newArr = new int[arr.length];
      print(arr);
      bubbleSort(arr);
      print(arr);
      int j=0;
      int k=1;
      for(int i =newArr.length-1;i>0;i--){
        if(j<newArr.length){
          newArr[j] = arr[i];
          j+=2;
        }
      }
      for(int i =0;i<newArr.length/2;i++){
        if(k<=newArr.length){
          newArr[k] = arr[i];
          k+=2;
        }
      }
      

    return newArr;
  }

    public static void main(String[] args) {
       int n = 7;
       int arr[] = {7, 1, 2, 3, 4, 5, 6};
       print(sortAlternateinArray(arr));

    }
}

