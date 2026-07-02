package BOSSCODER_Sessions.Session_12_Maths;

import java.util.ArrayList;

public class AllPrimeFactors {

  public static int[] PrintAllPrimeFactors(int n){

      ArrayList<Integer> l = new ArrayList();
      int i=2;
      while (n>0){
          if(n%i==0){
            l.add(n%2);      
            n = n/i;       
            }
            i++;
        }
        System.out.println(l);
        int[] arr = {0,0};
    return arr;
  }

  public static void print(int[] arr){
    for(int val : arr){
    System.out.print(val);
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int n = 315;
    print(PrintAllPrimeFactors(n));
  }
  
}
