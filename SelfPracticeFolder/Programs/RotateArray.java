package SelfPracticeFolder.Programs;

public class RotateArray {

  public static void rotate(int[] arr, int i, int j){
      while (i<j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; 
        i++;
        j--;
      }
  }

  public static int[] rotateNtimes(int [] arr, int k){
    rotate(arr, 0, k-1);
    rotate(arr, k, arr.length-1);
    rotate(arr, 0, arr.length-1);
    
    return arr;
  }
  public static void print(int[] arr){
    for(int val : arr){
      System.out.print(val+ " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7,8,9};
    int k =0;
    print(arr);
    print(rotateNtimes(arr, k));
    
  }
}
