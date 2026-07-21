package SelfPracticeFolder.Recursion;

public class Sum_1toN_ {
  
  public static int findSum(int n){
    if(n<=1) return 1;
    System.out.println(n);
    return n + findSum(n-1);
  }


  public static void main(String[] args) {
    int n =10;
    System.out.println(findSum(n));

  }
}
