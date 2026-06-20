package BOSSCODER_Sessions.Session_9_10_11_Searching_14_June;

public class Test1 {

static public int peak(int[]  input){
        int l =0;
        int r = input.length-1;
        int index = -1;

        while (l<=r){
          int mid = r-(r-l)/2;

          if(input[mid]>input[mid-1] && input[mid]> input[mid+1]) {
           index= mid;
           break;
           }
          else if(input[mid]>input[mid-1]){
                    l = mid+1;
          }else 
            {
              r = mid-1;
          }

        }

        return index;
        
    }
  public static void main(String[] args) {
    int[] nums = {1,2,1,3,5,6,4};
    System.out.println(peak(nums));


    
  }
  
}
