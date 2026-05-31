package BOSSCODER_Sessions.Session_6_2S_Array_30_May;

public class MatrixDiagonalSum {

  static public int diagnoalSum(int[][] mat) {
    int sum = 0;
    int side = mat.length;
    for (int i = 0; i < mat.length; i++) {
      int len = mat[i].length;
      for (int j = 0; j < len; j++) {
        if (i == j || i+j == side-1){
          // System.out.println("j== "+len+"-"+i +" - "+j);
          System.out.println("mat[" + i + "][" + j + "] - " + mat[i][j]);
          sum = sum + mat[i][j];

      }
    }

  }
  // if (mat.length % 2 == 0) {
  //     return sum;

  //   } else {
  //     System.out.println("----" + mat[side / 2][side / 2]);
  //     return sum - mat[side / 2][side / 2];
  //   }
  return sum;
}
    
  
  public static void main(String[] args) {

    int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    System.out.println(diagnoalSum(mat));

  }

  
}
