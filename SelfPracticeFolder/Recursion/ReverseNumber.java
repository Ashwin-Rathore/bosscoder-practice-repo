package SelfPracticeFolder.Recursion;

public class ReverseNumber {

  public static int reverse(int num) {

    int reverse = 0;
    while (num != 0) {
     // reverse*=10 ;
     reverse = reverse*10 + (num % 10) ;
      num /= 10;
     
    }

    return reverse;
  }

  public static int reverseRecursion(int n, int r){
    if(n==0) return r;
    return reverseRecursion(n/10,r*10+n%10);
  }

  public static void main(String[] args) {

    //int num = 123456789;
    //System.out.println(reverse(num));
    System.out.println(reverseRecursion(1234,0));
  }
}
