package Bosscoder_Module_1.BegineerModule.Session_7_String_31_May;

import java.util.HashMap;

public class IntegerToRoman {
    static public String intToRoman(int num){
        String s = "";

         int[] values = {
              1000, 900, 500, 400,
              100, 90, 50, 40,
              10, 9, 5, 4, 1
           };

         String[] symbols = {
              "M", "CM", "D", "CD",
              "C", "XC", "L", "XL",
              "X", "IX", "V", "IV", "I"
           };
            
            for(int i=0;i<values.length;i++){
            while (num >= values[i]) {
                s = s+symbols[i];
                num = num-values[i];
            }

            }
        return s;
    }

  public static void main(String[] args) {
    
    int num = 3749;
    System.out.println(intToRoman(num));

  }
}
