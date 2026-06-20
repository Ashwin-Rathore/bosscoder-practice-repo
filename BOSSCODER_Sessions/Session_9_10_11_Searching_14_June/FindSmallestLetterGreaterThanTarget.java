package BOSSCODER_Sessions.Session_9_10_11_Searching_14_June;

public class FindSmallestLetterGreaterThanTarget {
  
  public static char nextGreatestLetter(char[] letters, char target) {
        int len = letters.length;
        
        int lo = 1;
        int hi = len-1;

        while(lo<=hi){
            int mid = hi - (hi-lo)/2;

            if(letters[mid]==target) { 
              lo = mid+1;
              if(lo==letters.length) return letters[0];
              else return letters[0];
            }
            else if (letters[mid] > target) hi = mid-1;
            else lo = mid+1;

        }
            return letters[lo% letters.length];
    }


  public static void main(String[] args) {
    char[] letters = {'x','x','y','y'};
    char target = 'z';
    System.out.println(nextGreatestLetter(letters, target));
  }
}
