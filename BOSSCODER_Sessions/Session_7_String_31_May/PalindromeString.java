package BOSSCODER_Sessions.Session_7_String_31_May;

public class PalindromeString {

    static public boolean palindrom(String s){
        String rev = "";
        char [] ch = s.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            rev = rev+ch[i];
        }
        System.out.println(rev);
        if (rev.equals(s)) return true;
        else return false;
    }
  public static void main(String[] args) {

    String s = "abcba";
    System.out.println(palindrom(s));


  }
  
}
