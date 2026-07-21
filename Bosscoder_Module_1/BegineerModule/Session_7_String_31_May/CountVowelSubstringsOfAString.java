package Bosscoder_Module_1.BegineerModule.Session_7_String_31_May;

import java.util.HashMap;
import java.util.HashSet;

public class CountVowelSubstringsOfAString {

  static public boolean isVowel(char c){
   
      if( c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u'){
        return true;
      }
      return false;
  }

  static public int countVowelSubString(String s){
      s.toLowerCase();
      int count =0;

    for (int start =0;start<s.length();start++) {
        
      HashSet<Character> h = new HashSet<>();
      
      for(int end=start; end<s.length();end++){
           
            char characterSeq = s.charAt(end);
                 if(!isVowel(characterSeq) ){
                      break;
                }else
                    h.add(characterSeq);
                if(h.size() == 5){
                    count++;
                }

        }

    }



      return count;
  }
  
  public static void main(String[] args) {
    
    String s = "cuaieuouac";
    System.out.println(countVowelSubString(s));

  }
}
