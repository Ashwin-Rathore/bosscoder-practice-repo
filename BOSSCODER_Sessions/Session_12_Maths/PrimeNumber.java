package BOSSCODER_Sessions.Session_12_Maths;

public class PrimeNumber {

  static public boolean isPrime(int num){
    boolean flag = true;

      for(int i=2;i<num/2;i++){
          if(num%i==0) {
            flag = false;
            break;
          }
      }

    return flag;

  }

  public static void main(String[] args) {
    int num = 31;
    System.out.println(isPrime(num));
  }
}
