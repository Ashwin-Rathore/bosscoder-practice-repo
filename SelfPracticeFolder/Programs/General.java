package SelfPracticeFolder.Programs;

import java.util.Arrays;

public class General {
    public static void change(int a){
      a =55;
      System.out.println(a);
    }
     public static void println (int [] x){
      for(int val : x){
        System.out.print(val+" ");
      }
     }
  public static void main(String[] args) {
    
      // int x = 10;
      // System.out.println(x);
      // change(x);
      // System.out.println(x);

    int[] arr = {1,2,3,4,5};
    Arrays.copyOf(arr,arr.length);
    println(arr);
    Arrays.sort(arr);
    //Arrays.sort(arr,(a,b) ->(a-b) );
    


  }
}
