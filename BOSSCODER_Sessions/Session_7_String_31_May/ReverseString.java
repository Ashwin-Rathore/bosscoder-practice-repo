package BOSSCODER_Sessions.Session_7_String_31_May;

public class ReverseString {

  static public String[] reverseStr(String [] s){
    String  temp;
        int len = s.length;
        //let newArr = new Array(len);
        for(int i =0;i<s.length/2;i++){
                temp  = s[i];
                s[i] = s[len-1-i];
                s[len-1-i] = temp;
              
        }
          for(int i =0;i<s.length;i++){
            System.out.println(s[i]);
          }

      return s;
    }

  public static void main(String[] args) {

    String[] s = { "h", "e", "l", "l", "o" };
    System.out.println(reverseStr(s));

  }
}
