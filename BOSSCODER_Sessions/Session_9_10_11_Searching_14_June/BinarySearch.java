package BOSSCODER_Sessions.Session_9_10_11_Searching_14_June;

public class BinarySearch {
    public static boolean implementBinary(int [] arr, int target){
          boolean flag = false;
          int len = arr.length-1;
          int left =0;
          int right = len;
          int mid;

          while(left<=right){
            mid = right - (right-left)/2;
            if(arr[mid]==target) {
              flag = true;
              return flag;
            }
            else if (arr[mid]>target) right = mid-1;
            
            else left = mid+1;
            
          }  
          return false;
    }
  public static void main(String[] args) {
    int[] arr = {1,4,6,7,9,13,45,56,67,78,89,100};
    int target = 100;
    System.out.println(implementBinary(arr,target));
  }
}
