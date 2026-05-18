//     *
//    * *
//   *   *
//  *     *
//   *   *
//    * *
//     *

package BOSSCODER_Sessions.JavaExecution;

public class Pattern7_Retry {

  public static void main(String[] args) {

    int n =3;
    int row=7;
    int column = 7;

    
        for(int i=0;i<n;i++){

               for(int j =0;j<n;j++){
                    if(j==n ){
                System.out.print("* ");
               } else System.out.print(". ");
               }
                System.out.println();
                n--;
        }
        

  }

}

