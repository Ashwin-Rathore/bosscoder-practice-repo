package Bosscoder_Module_1.BegineerModule.Session_7_String_31_May;

public class SortingTheSentence {

  static public String sortingSentence(String s){
    
    String newStr = "";
    String [] arr = s.split(" ");
    String[] newArr = new String[arr.length];

        for(int i=0;i<arr.length;i++){
                String word = arr[i];
            int digit = word.charAt(word.length()-1) - '0';
           // System.out.println("Digit "+digit); 
            newArr[digit-1] = word.substring(0, word.length()-1);
            //System.out.println("new Arr"+i+" "+ newArr[i]);
        }

          for(int i=0;i< newArr.length;i++){
            //System.out.println(newArr[i]+" ");
              newStr = newStr +newArr[i];
              if(i<newArr.length-1){
                  newStr+= " ";
              }
          }
            return newStr;
  }

  public static void main(String[] args) {
    String s = "is2 sentence4 This1 a3";
    System.out.println(sortingSentence(s));

  }
  
}
