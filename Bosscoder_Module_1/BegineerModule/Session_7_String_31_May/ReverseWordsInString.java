package Bosscoder_Module_1.BegineerModule.Session_7_String_31_May;

public class ReverseWordsInString {

  static public String reverseString(String str){
      String revStr = "";
      String[] s = str.split(" ");
      for(int i=s.length-1;i>=0;i--){
          revStr = revStr+s[i]+" ";
      }


      return revStr;
  }
  public static void main(String[] args) {
      String s = "bosscoder quiz practice code";
    System.out.println(reverseString(s));


  }
  
}
