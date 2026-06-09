package SelfPracticeFolder.Java.BitManipulation;

public class BinaryToDecimal {
  static public double binaryToDecimalConversion(String s){
      double num=0;
          for(int i=s.toCharArray().length-1;i>=0;i--){
            int power =0;
            double pow = Math.pow(2, power);
            int value = s.charAt(i)-'0';
           // System.out.println(s.charAt(i).getClass().getSimpleName()); 
                num = num+ s.charAt(i)-'0' * pow;
                power++;
                System.out.println("2^i - "+pow);
          }
      return num;
  }

  public static void main(String[] args) {
    
      String s = "1101";
      System.out.println(binaryToDecimalConversion(s));

  }
  
}
