package BOSSCODER_Sessions.Session_7_String_31_May;

public class FirstMatchingCharacterFromBothEnds {
  static public int matchingChar(String s){
            char[] ch = s.toCharArray();
            if(ch.length ==1) return 0;
            int len = ch.length;
            for(int i=0;i<ch.length;i++){
                    if(ch[i] == ch[len-i-1]) return 1;
            }
        return -1;

  }
  public static void main(String[] args) {
    
    String s = "c";
    System.out.println(matchingChar(s));
  }
}
