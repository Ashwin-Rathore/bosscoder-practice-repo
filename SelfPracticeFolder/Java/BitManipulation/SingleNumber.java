package SelfPracticeFolder.Java.BitManipulation;

public class SingleNumber {

  static public int getSingle(int[] arr){
      int xor =0;
        for(int element : arr){ 
            xor = xor^element;
        }
      return xor;
  }
  
  public static void main(String[] args) {
      int [] arr = {4,3,2,2,3,2,3};
          System.out.println(getSingle(arr));
       
  }
}
