package Bosscoder_Module_1.BegineerModule.Session_8_NumberSystem_BitManipulation_13_June;

public class XOR_OperationInAnArray {
    static public int xorOperation(int n, int start){
        int sum =0;
        int[] nums = new int[n];
          for(int i=0;i<5;i++){
            nums[i] = start +2 *i;
            sum= sum^nums[i];
          }

      return sum;
    }


  public static void main(String[] args) {
      int n = 5; 
      int  start = 0;
      System.out.println(xorOperation(n,start));
  }
}
