package BOSSCODER_Sessions.Session_9_10_11_Searching_14_June;

public class VersionControl {

  public int firstBadVersion(int n) {
        int l =1;
        int r = n;
        while(l<=r){

            int mid = r - (r-l)/2;
            boolean ans =true; //isBadVersion(mid);
            if(ans){
                r = mid-1;
            }else {
                l = mid+1;
            }

        }

        return l;
    }

  public static void main(String[] args) {
    int n = 5;
    System.out.println(firstBadVersion(n));
  }
}
