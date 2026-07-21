package Bosscoder_Module_1.BegineerModule.Session_9_10_11_Searching_14_June;

public class DecendingOrder {

    public static boolean searchDecensingOrder(int[] arr, int k){
        boolean flag = false;
        int l =0;
        int r = arr.length-1;

          while(l<=r){
            int mid = r -(r-l)/2;
              if( arr[mid]== k) {
                System.out.println("Index : "+mid);
                return flag = true;
              }
                else if(arr[mid]< k) r = mid-1;
                  else  l = mid+1;
          }

      return flag;
    }
  public static void main(String[] args) {
    // int[] arr = {1,3,5,67,123,155};
    int[] arr = {76,65,54,43,32,21,16,15,14,11,9,05,04,1};
    int k = 14;
    System.out.println(searchDecensingOrder(arr,k));
  }
  
  

}
