package SelfPracticeFolder.Recursion;

public class Print1_n {
  static  int n = 10;  
  public static void print(int start){
    if(start>n) return;
    System.out.println(start);
    print(start+1);
  }
  
  public static void main(String[] args) {
   // int n = 10;
    int start = 1;
    print(start);

  }
}
