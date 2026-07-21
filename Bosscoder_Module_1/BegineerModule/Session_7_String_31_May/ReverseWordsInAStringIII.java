package Bosscoder_Module_1.BegineerModule.Session_7_String_31_May;

public class ReverseWordsInAStringIII {

    static public String revWord(String s){
      String rev = "";
      // String sr = "";
      String[] str = s.trim().split(" ");
        for(int i =0;i<str.length;i++){
                String sr = "";
                char[] ch = str[i].toCharArray();
            for(int j = str[i].length()-1;j>=0;j--){   
                    sr = sr+ch[j];
                    ;
            }
            rev = rev+sr;
            if(i<str.length){
              rev = rev + " ";
            }
        }
      return rev;
    }
  public static void main(String[] args) {
    
    String s ="Let's take LeetCode contest";
    System.out.println(s);
      System.out.println(revWord(s));
  }
  
}
