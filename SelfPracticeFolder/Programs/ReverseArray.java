package SelfPracticeFolder.Programs;

public class ReverseArray {
  
   public static void print(int[] a){
      for(int val : a){
        System.out.print(val+" ");
      }
   }
  public static void main(String[] args) {
    
    int[] arr = {1,2,3,4,5,6,7,8,9};
    print(arr);
    System.out.println();
    for(int i=2,j=arr.length-3;i<(arr.length-3)/2;i++,j--){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j]=temp;
    }
    print(arr);
  }
}
