package SelfPracticeFolder.Java.BitManipulation;

public class DecimalToBinary {
  static public String decimalToBinaryConversion(int a){
      String ans = "";

          while(a>0){
              int rem = a%2;
              ans = rem+ans;
              a = a/2;
          }

      return ans;
  }

  public static void main(String[] args) {
    
      int a =13;
      System.out.println(decimalToBinaryConversion(a));

  }
  
}
