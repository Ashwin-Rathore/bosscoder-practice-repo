//         1
//       1   1
//     1   2   1
//   1   3   3   1
// 1   4   6   4   1


package Bosscoder_Module_1.BegineerModule.JavaPracticeExecution;

public class Pattern5 {
  
    public static void pattern(int row, int column){

        for(int i =0;i<row;i++){
          for(int k=0;k<column-i;k++){
              System.out.print(" ");
          }

          for(int j =0;j<=i;j++){
              System.out.print(ncr(i, j)+" ");
          }
          System.out.println("");
        }

    }

    public static int fact(int num){
        int sum =1;
        //int n =1;
        while(num>0){
            sum = sum*num;
            num--;
        }
        return sum;
    }
  
    public static int ncr(int n, int r){

        return fact(n)/(fact(r)*(fact(n-r)));

    }

    public static void main(String[] args) {


        pattern(5, 5);


    }

}

