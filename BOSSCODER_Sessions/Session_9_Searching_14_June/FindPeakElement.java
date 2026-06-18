package BOSSCODER_Sessions.Session_9_Searching_14_June;

public class FindPeakElement {

   public static  int findPeakElement(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] < nums[mid + 1]) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }

        return lo;
    }
     public static void main(String[] args) {
    
    int[] arr = {1,2,1,3,5,6,4};
    System.out.println(findPeakElement(arr));  
  }

}
