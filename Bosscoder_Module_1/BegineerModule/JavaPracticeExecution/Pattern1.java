// * * * * 
// * * * * 
// * * * * 
// * * * * 
// * * * * 

package Bosscoder_Module_1.BegineerModule.JavaPracticeExecution;

public class Pattern1 {

    public static void pattern(int row, int column){

        for(int i =0;i<row;i++){

          for(int j =0;j<column;j++){
              System.out.print("* ");
          }
          System.out.println("");
        }

    }
  
    public static void main(String[] args) {


        pattern(5, 4);


    }

}

