package BOSSCODER_Sessions.JavaPracticeExecution;


public class Febonaci {

    public static int fab(int n, int[] memo){
      int result;
       if (memo[n] != 0) {
        return memo[n];
      }
      if(n==1 ||n==2){
        result = 1;
        }else
          result = fab(n-1,memo) + fab(n-2,memo);
          memo[n] = result;

      return result;
    }

    public static void main(String[] args) {
      int n = 10;
      int[] memo = new int[n + 1];
      System.out.println(fab(n, memo));
    }

}
