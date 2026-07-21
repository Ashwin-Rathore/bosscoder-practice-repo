package Bosscoder_Module_1.BegineerModule.Session_9_10_11_Searching_14_June;

// Find the missing vowel from the array 

import java.util.ArrayList;

public class Test2 {
  public static char[] findMissingVowel(char[] input){
    char[] finalCh =  new char[input.length];
    ArrayList<Character> list = new ArrayList<>();
      list.add('a');
      list.add('e');
      list.add('i');
      list.add('o');
      list.add('u');

      for(int i=0;i<input.length;i++){
        if(!list.contains(input[i])){
          finalCh[i] = input[i];
        }

      }
    return finalCh;
  }

  public static void main(String[] args) {
    char [] input = {'a','b','e','i','o'};
    System.out.println(findMissingVowel(input));

    
  }
  
}
