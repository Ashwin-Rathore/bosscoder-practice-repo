package BOSSCODER_Sessions.Session_5_1D_Array_24_May;

public class PlusOne {


 

  static public int onePlus(int [] digits){
    int sum =0;
    String concat = "";
    for(int i=0;i<digits.length;i++){
        concat = concat+digits[i];
    } 
      sum = Integer.parseInt(concat)+1;
      

    return sum;
  }

  public static void main(String[] args) {
     int[] digits = {4,3,2,1};
      System.out.println(onePlus(digits));
  }
  
}
