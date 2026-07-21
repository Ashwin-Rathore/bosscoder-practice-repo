package SelfPracticeFolder.Recursion;

public class AraiseToPowerB {
  public static int raiseToPower(int a,int b){
    if(b<=1) return 1;
    return a * raiseToPower(a,b-1);
  }

  public static void main(String[] args) {
    int a =2;
    int b = 5;
    System.out.println(raiseToPower(a,b));
  }
}
