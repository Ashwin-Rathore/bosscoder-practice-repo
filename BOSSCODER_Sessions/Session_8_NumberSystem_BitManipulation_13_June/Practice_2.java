package BOSSCODER_Sessions.Session_8_NumberSystem_BitManipulation_13_June;

public class Practice_2 {
    static public boolean powerFind(int a){
        if(a ==0) return false;
        while(a>0){
            if(a==1) return true;
            if(a%2==1) return false;
            a = a/2;
            
        }

        return true;
   
   
   
    }

  public static void main(String[] args) {
        int a = 12;
        System.out.println(powerFind(a));
  }
}
