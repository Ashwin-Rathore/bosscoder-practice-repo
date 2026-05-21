package BOSSCODER_Sessions.JavaExecution;

import java.util.HashMap;

public class WordPattern {


  public static boolean workPattern(String pattern, String s){
    char [] patArray = pattern.toCharArray();
    String[] sArr = s.split(" ");
    
      HashMap<Character,String> myMap = new HashMap<>();
        
        if(patArray.length!=sArr.length) return false;
        
        for(int i =0;i<patArray.length;i++){
        
        if(myMap.containsKey(patArray[i])){
         
            if(!myMap.get(patArray[i]).equals(sArr[i])) return false;
        }
        else{
                
                if (myMap.containsValue(sArr[i])) 
                    return false;

                myMap.put(patArray[i], sArr[i]);
            }

        }
 return true;
}
  
      
  
  public static void main(String[] args) {
       String pattern ="abba";
       String s = "dog cat mouse dog";


      System.out.println(workPattern(pattern, s));

  }
  
}
