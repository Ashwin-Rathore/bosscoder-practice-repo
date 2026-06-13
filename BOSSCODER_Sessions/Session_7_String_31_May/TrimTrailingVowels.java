package BOSSCODER_Sessions.Session_7_String_31_May;

public class TrimTrailingVowels {
  static public String trimVowel(String s){
      String finalStr = "";
      char[] ch = s.toCharArray();
      StringBuffer sb = new StringBuffer();
      for(int i=ch.length-1;i>0;i--){
        if(ch[i]!= 'a' ||ch[i]!= 'e' ||ch[i]== 'i' ||ch[i]== 'o' ||ch[i]== 'u')
            if(ch[i]== 'a' ||ch[i]== 'e' ||ch[i]== 'i' ||ch[i]== 'o' ||ch[i]== 'u'){
              s.substring(0, i-1);
              System.out.println("New String : "+s);
            }
          
            
      }
      System.out.println("sb "+ sb);
      return finalStr;
  }
  public static void main(String[] args) {
    String s = "idea";
    System.out.println(trimVowel(s));
  }
}
