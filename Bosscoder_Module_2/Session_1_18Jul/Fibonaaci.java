package Bosscoder_Module_2.Session_1_18Jul;

public class Fibonaaci {
  
  public static long fiboIterative(int n){
    long prev = 0;
        long curr = 1;

        for (int i = 2; i <= n; i++) {
            long next = prev + curr;
            prev = curr;
            curr = next;
        }

        return curr;
  }

  public static long fiboRec(int n){
      if(n== 0 || n==1) return n;
    return fiboRec(n-1)+ fiboRec(n-2);
  }
// 0 1 2 3 4 5 6  
// 0 1 1 2 3 5 8
  public static void main(String[] args) {
   // System.out.println(fiboIterative(60));
   System.out.println(fiboRec(60));
  }

}
