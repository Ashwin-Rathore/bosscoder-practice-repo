//     *
//    * *
//   *   *
//  *     *
//   *   *
//    * *
//     *

package Bosscoder_Module_1.BegineerModule.JavaPracticeExecution;

public class Pattern7_Retry {

  public static void main(String[] args) {

    int n =4;
    int temp = n;
    int newTemp = n;  
        for(int i=0;i<=n;i++){
               for(int j =0;j<=n*2;j++){
                    if(j==temp || j==newTemp && i!=0 ){
                        System.out.print("* ");
                    }  
                    else
                        System.out.print("  ");                        
               }
               System.out.println();
               temp--;
               newTemp++;   
        }
                 temp = 1;
                 newTemp = (n * 2) - 1;
            for(int k=n-1;k>0;k--){
                for(int j =0;j<=n*2;j++){
                    if(j==temp || j==newTemp){
                        System.out.print("* ");
                    }  
                    else
                        System.out.print("  ");
                        
               }
               System.out.println(); 
               temp++;
               newTemp--;   
            }
  }

}

