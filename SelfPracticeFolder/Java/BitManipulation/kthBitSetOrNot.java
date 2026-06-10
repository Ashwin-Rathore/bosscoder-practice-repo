package SelfPracticeFolder.Java.BitManipulation;

public class kthBitSetOrNot {

    static public boolean findKthBit(int num,int kth_Bit){
      //  System.out.println("kth_Bit : "+kth_Bit);
      //   String bits = "";
      //   while(num>0){
      //       int a = num%2;
      //       bits = a+bits;
      //       num = num/2;
      //   }
      //     System.out.println("Bits : "+bits);
            
      //           if(bits.charAt(bits.toCharArray().length-1-kth_Bit)-'0' == 1) return true;
    //  return false;

      return ((num>>kth_Bit) % 2 ==1);

    }
  public static void main(String[] args) {
    int num = 5;
    int kth_Bit = 0;
      System.out.println(findKthBit(num,kth_Bit));  

  }
  
}
