package Bosscoder_Module_1.BegineerModule.JavaPracticeExecution;

public class TestPractice {

  static public int fact(int num) {
    int factorial = 1;
    for (int i = num; i >= 1; i--) {
      factorial = factorial * i;
    }
    // System.out.println("Num :"+num+" Fact -"+factorial);
    return factorial;
  }

  static public int ncr(int n, int r) {
    return fact(n) / (fact(r) * (fact(n - r)));
  }

  public static void main(String[] args) {

    // *
    // * *
    // * * *
    // * * * *
    // * * * * *

    // ---------------2--------------------
    // int row = 5;
    // int column = 6;

    // for(int i=0;i<row;i++){

    // for(int j =0;j<=i;j++){
    // System.out.print("* ");
    // }
    // System.out.println(" ");
    // }

    // ---------------3--------------------
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *

    // int row = 5;
    // int column = 5;

    // for(int i=0;i<row;i++){

    // for(int j =0;j<column-i;j++){
    // System.out.print("* ");
    // }
    // System.out.println(" ");
    // }

    // ---------------4--------------------

    // *
    // * *
    // * * *
    // * * * *
    // * * * * *

    // int row = 5;
    // int column = 5;

    // for(int i=0;i<row;i++){

    // for(int j =0;j<column-i-1;j++ ){
    // System.out.print(" ");
    // }

    // for(int k =0;k<=i;k++){
    // System.out.print("* ");
    // }
    // System.out.println();
    // }

    // ---------------5--------------------

    // 1
    // 1 1
    // 1 2 1
    // 1 3 3 1
    // 1 4 6 4 1

    // int row = 5;
    // int column = 5;

    // for(int i=0;i<row;i++){

    // for(int j =0;j<column-i;j++ ){
    // System.out.print(" ");
    // }

    // for(int k =0;k<=i;k++){
    // // System.out.println("value of i: "+i +" -- Value of k :"+k);
    // System.out.print(ncr(i,k)+" ");
    // // System.out.print("* ");
    // }
    // System.out.println();
    // }

    // ---------------6--------------------

    // * * * * *
    // *       *
    // *       *
    // *       *
    // * * * * * 

    int n = 5;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if ((i == 0) || i == n - 1 || j == 0 || j == n - 1) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }

  }

}
