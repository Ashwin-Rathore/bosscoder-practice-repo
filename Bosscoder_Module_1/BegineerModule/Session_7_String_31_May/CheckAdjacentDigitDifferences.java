package Bosscoder_Module_1.BegineerModule.Session_7_String_31_May;

public class CheckAdjacentDigitDifferences {
    static public boolean checkDifference(String s){
      boolean flag = false;

        char[] ch = s.toCharArray();

        for(int i=1;i<ch.length;i++){
            if((Math.abs((ch[i]-'0') - (ch[i-1]-'0')))<=2){
                flag = true;
            }else 
              return false;
        }

      return flag;
    }

  public static void main(String[] args) {
    
      String s = "301";

      System.out.println(checkDifference(s));
  }
}
