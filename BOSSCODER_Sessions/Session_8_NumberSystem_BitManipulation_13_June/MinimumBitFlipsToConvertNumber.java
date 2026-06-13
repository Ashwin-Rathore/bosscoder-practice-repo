package BOSSCODER_Sessions.Session_8_NumberSystem_BitManipulation_13_June;


public class MinimumBitFlipsToConvertNumber {

    static public int minBitFlip(int start,int goal){
    int counter =0;
      int sum = start^goal;

      while(sum>0){
          if(sum%2!=0){
            counter++;
          }
          sum = sum/2;
      }


    return   counter;
  }

  public static void main(String[] args) {
    int start = 3, goal = 4;
    System.out.println(minBitFlip(start,goal));
  }
}
