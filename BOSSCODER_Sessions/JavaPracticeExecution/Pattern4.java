//     *
//    * *
//   * * *
//  * * * *
// * * * * *

package BOSSCODER_Sessions.JavaPracticeExecution;

public class Pattern4 {
  
    public static void pattern(int row, int column){

        for(int i =0;i<row;i++){
          for(int k=0;k<column-i;k++){
              System.out.print(" ");
          }

          for(int j =0;j<=i;j++){
              System.out.print("* ");
          }
          System.out.println("");
        }

    }
  
    public static void main(String[] args) {


        pattern(5, 5);


    }

}

