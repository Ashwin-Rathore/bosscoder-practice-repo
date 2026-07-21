package Bosscoder_Module_1.BegineerModule.Session_9_10_11_Searching_14_June;

public class FirstAndLastOccurance {
    public static int[] findFirstAndLastOccurance(int[] arr,int target){
      int[] finalIndexs  = new int[2];
      int l =0;
      int r = arr.length-1;
      int l_index = -1;
      int m_index = -1;

      while (l<=r){
          int mid = r-(r-l)/2;

          if(arr[mid]<target) l = mid+1;
          else if (arr[mid]> target) r = mid-1;
          else {
              l_index  = mid;
              r = mid-1;
          }
      }

       l =0;
       r = arr.length-1;
      while (l<=r){ 
        int mid = r-(r-l)/2;
          if(arr[mid]<target) l = mid+1;
          else if (arr[mid]> target) r = mid-1;
          else {
              m_index  = mid;
              l = mid+1;
          }
      }

        finalIndexs[0] = l_index;
        finalIndexs[1] = m_index;


      System.out.println(finalIndexs[0]+" : "+finalIndexs[1]);

      return finalIndexs;
    } //add

  public static void main(String[] args) {
    int[] arr = {1,3,5,5,5,5,67,123,155};
    int target = 5;
    System.out.println(findFirstAndLastOccurance(arr,target));
  }
}
