package BOSSCODER_Sessions.Session_9_Searching_14_June;

public class LastOccurance {

  public static int findLastOccurance(int[] arr, int target){
    int index = -1;
    int left = 0;
    int right = arr.length-1;

      while(left<=right){
          int mid = right -(right -left)/2;
          if(arr[mid]> target) right = mid-1;
          else if (arr[mid]<target) left = mid+1;
          else{
              index = mid;
              left = mid+1;
          }


      }


    return index;  // test
  }
  
  public static void main(String[] args) {
    
    int[] arr = {1,3,5,5,5,5,67,123,155};
    int target = 5;
    System.out.println(findLastOccurance(arr,target));
  }
}
