package BOSSCODER_Sessions.Session_7_String_31_May;

public class TrimTrailingVowels {
  static public String trimVowel(String s){
    
     
      char[] ch = s.toCharArray();
      int counter =ch.length-1;
        for(int i=ch.length-1; i>=0;i--){
          if(ch[i]== 'a' ||ch[i]== 'e' ||ch[i]== 'i' ||ch[i]== 'o' ||ch[i]== 'u') counter--;
          else break;

        }
      return s.substring(0, counter+1);
  }
  public static void main(String[] args) {
    String s = "day";
    System.out.println(trimVowel(s));  
  }
}
