package Bosscoder_Module_1.BegineerModule.Session_7_String_31_May;

import java.util.HashSet;

public class GreatestEnglishLetterInUpperAndLowerCase {
  //static char cha ;
    static public String greatestEnglishLetter(String s){
      
        char[] ch = s.toCharArray();
        HashSet<Character> h = new HashSet<>();
          for(int i=0;i<ch.length;i++){
              h.add(ch[i]);
          }

          for(char c = 'Z';c>='A';c--){
                if(h.contains(c) && h.contains((char)(c+32))){
                      return Character.toString(c);
                }
          }

          return "";
    }

  public static void main(String[] args) {
    String s = "lEeTcOdE";
    System.out.println("---"+greatestEnglishLetter(s));
  }
}

