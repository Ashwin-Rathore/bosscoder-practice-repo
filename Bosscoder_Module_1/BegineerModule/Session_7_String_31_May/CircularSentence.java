package Bosscoder_Module_1.BegineerModule.Session_7_String_31_May;

public class CircularSentence {

  static public boolean circularSentences(String sentence){
      boolean flag = false;
      String currentStr;
      String nextStr;
    
      //"leetcode exercises sound delightful"
    
      String[] str = sentence.split(" ");
          for(int i =0;i<str.length;i++){
                 currentStr = str[i];
                if(i< str.length-1){
                     nextStr = str[i+1];
                }else{
                    nextStr = str[0];
                }

                if(currentStr.charAt(currentStr.length()-1)==(nextStr.charAt(0))){
                    flag = true;
                }else{
                  return flag=false;
                }
                
          }

      return flag;
  }

  public static void main(String[] args) {
    String sentence = "Leetcode is cool"; //"leetcode exercises sound delightful";
    System.out.println(circularSentences(sentence));
  }
}
