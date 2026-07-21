package Bosscoder_Module_1.BegineerModule.Session_8_NumberSystem_BitManipulation_13_June;

public class CountSetBits {

    static public int  count1sBits(int a){
      int count =0;
        while(a>0){
            if(a%2!=0){
                count++;
            }
            a /= 2;
        }


      return count;
    }

  public static void main(String[] args) {
    int a = 6;
    System.out.println(count1sBits(a));
  }
}
