package Bosscoder_Module_2.Session_5_1Aug;

public class powerOf3 {
   public static boolean isPowerOfThree(int n) {
        
        if(n<1) return false;
        if(n==1) return true;

        if (n%3==0) return isPowerOfThree(n/3);
          return false;
   }
  public static void main(String[] args) {
    int n = 28;
    System.out.println(isPowerOfThree(n));

  }
}
