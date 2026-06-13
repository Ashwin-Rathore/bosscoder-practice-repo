package BOSSCODER_Sessions.Session_8_NumberSystem_BitManipulation_13_June;

public class Practice_1 {

  static public boolean pract(int a){
        if((a & (1<<0)) == 0)  return true;
        return false;
  }

  public static void main(String[] args) {
        int a = 8;
        System.out.println(pract(a));
  }
}
