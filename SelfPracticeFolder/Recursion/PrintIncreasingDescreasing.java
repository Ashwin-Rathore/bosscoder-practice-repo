package SelfPracticeFolder.Recursion;

public class PrintIncreasingDescreasing {

  public static void print(int n){
    if(n<=0) return;
    
    System.out.println(n);
    print(n-1);
    
    //print(n-1);
    if (n!=1)System.out.println(n);
  }

  public static void main(String[] args) {
    int n =5;
    print(n);
  }
  
}
