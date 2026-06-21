package BOSSCODER_Sessions.Session_12_Maths;

public class hcf {

  public static boolean findFactor(int a,int b){
      // int max_a = 0;
      // int max_b = 0;
      boolean flag = false;
      //   // for(int i=1;i<a/2;i++){
      //   //     if(a%i==0){
      //   //         if(i> max_a){
      //   //           max_a = i;
      //   //         }
      //   //     }
      //   // }

      //   for(int i=1;i<b/2;i++){
      //       if(b%i==0){
      //           if(i> max_b){
      //             max_b = i;
      //           }
      //       }
      //   }
      //   System.out.println("max_a :"+ max_a);
      //   System.out.println("max_b :"+ max_b);
      //   if(max_a == max_b) flag = true;

      //   return flag;

        int newNum = 0;
          newNum = b%a;
       //   if(newNum%a==0) return newNum; 


      return flag;
  }

  public static void main(String[] args) {
    
    int a = 96;
    int b= 46;
    
    System.out.println(findFactor(a, b));
  }
  
}
