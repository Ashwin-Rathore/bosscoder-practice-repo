package Bosscoder_Module_1.BegineerModule.Session_9_10_11_Searching_14_June;

public class GuessNumberHigherOrLower {
   public int guessNumber(int n) {

        if(n==1) return n;
        int l = 0;
        int r = n;

        while(l<=r){
            int mid = r - (r-l)/2;
            int result = 0;
            // int result = guess(mid); - This step will not work as needs api fof guess from leetcode 374 qs
            
            
            if(result == 0) return mid;
            else if(result == -1) r = mid-1;
            else l = mid+1;


        }
        return -1;
    }

  public static void main(String[] args) {
    
  }
}
