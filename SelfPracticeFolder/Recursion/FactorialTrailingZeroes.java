package SelfPracticeFolder.Recursion;

public class FactorialTrailingZeroes {
  
    public static int trailingZeroes(int n) {

      
        int trail = 0;
            if(n==0) return trail;
        long fact = 1;
        
        while(n!=0){
            fact = fact *n;
            n--;
        }
        System.out.println(fact);
        
        while(fact!=0){
            if(fact%10==0){
                trail++;
                fact= fact/10;
            }else return trail;
            
        }
            return trail;
    }
  public static void main(String[] args) {
    int n =30;
    System.out.println(trailingZeroes(n));

  }
}
