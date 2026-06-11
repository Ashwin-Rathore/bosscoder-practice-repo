package SelfPracticeFolder.Java.BitManipulation;

public class TurnOnBit {
  public static void main(String[] args) {
    int num = 54;
    int kth_Bit = 1;
    int newNum = 1<<kth_Bit;
        System.out.println("kth_Bit : "+kth_Bit);
        String bits = "";
        String newBits = "";
        while(num>0){
            int a = num%2;
            bits = a+bits;
            num = num/2;
        }
        System.out.println("Bits : "+bits);
        while(newNum>0){
            int a = newNum%2;
            newBits = a+newBits;
            newNum = newNum/2;
        }
        System.out.println("newBits : "+newBits);
         int finalNum = num | newNum ;
        System.out.println("final Num : "+finalNum);

  }
}
