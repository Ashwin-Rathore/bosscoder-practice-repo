package BOSSCODER_Sessions.Session_13_Sort_27_June;

public class MoveAllZerosToEnd {

   static public void print(int[] arr){
      for(int value : arr){
          System.out.print(value+" ");
      }
      System.out.println();
  }

  static public int[] moveZero(int [] arr){
      int n = arr.length-1;
      int swapCount = 0;
      for( int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                if( arr[j]== 0){ // To move all zero to end
          // if( arr[j+1]== 0){ To move all zero to front
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
    int [] arr = {-2,1,0,3,0,2,0};
    print(arr);
    print(moveZero(arr));
  }

}
  

