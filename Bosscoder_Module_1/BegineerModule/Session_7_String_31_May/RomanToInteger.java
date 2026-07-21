package Bosscoder_Module_1.BegineerModule.Session_7_String_31_May;

import java.util.HashMap;

public class RomanToInteger {

  public static int roman(String s){
    int result = 0;

      HashMap<Character,Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        for(int i=0;i<s.length();i++){
            
          int currentValue = roman.get(s.charAt(i));
            if(i<s.length()-1){
                int nextValue = roman.get(s.charAt(i+1));
            

            if(currentValue<nextValue){
                result = result-currentValue;
            }else{
                result = result+currentValue;
            }


              }
              else{
                  result = result+currentValue;
              }
        }


      return result ;
  }

  public static void main(String[] args) {
    String s = "MCMXCIV";
    System.out.println(roman(s));
    
  }
  
}
