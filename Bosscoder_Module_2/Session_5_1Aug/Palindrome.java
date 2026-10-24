package Bosscoder_Module_2.Session_5_1Aug;

public class Palindrome {
  
public static boolean findPalindrome(String s, int left, int right) {
        
    if(left>=right) return true;
    if(s.charAt(left)!=s.charAt(right)) return false;
    return findPalindrome(s, left+1, right-1);
    }


 public static boolean isPalindrome(String s) {
         return findPalindrome(s,0,s.length()-1);
    }


    public static void main(String[] args) {
      
      String s = "abba";
      System.out.println(isPalindrome(s));


    }  
}
