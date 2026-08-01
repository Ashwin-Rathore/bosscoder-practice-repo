package SelfPracticeFolder.Recursion;

public class HCF_TwoNumber {
  
  public static int findHCF(int a,int b){
    int hcf = 0;
    int i =1;
      while(a>=1 && b >=1){
        if(i==a || a==b) return hcf;
          if(a%i==0 && b%i==0){
            if(i>hcf){
              hcf=i;
            }
          }
          i++;
      }

    return hcf;
  }


  public static void main(String[] args) {
    
    int a = 3;
    int b = 8;

    System.out.println(findHCF(a,b));
  }
}
