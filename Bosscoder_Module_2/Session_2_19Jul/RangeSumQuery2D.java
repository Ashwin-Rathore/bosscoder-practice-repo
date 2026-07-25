package Bosscoder_Module_2.Session_2_19Jul;

public class RangeSumQuery2D {
  
  // public static int arraySum (int[][] matrix,int row1, int col1, int row2, int col2){
  //     int finalSum = 0;
  //     int [][] newArr = new int[matrix.length][matrix[0].length];
  //     newArr[0][0] = matrix[0][0];
  //     for (int j = 1; j < matrix[0].length; j++) {
  //       newArr[0][j] = newArr[0][j - 1] + matrix[0][j];
  //         } 
  //     for (int i = 1; i < matrix.length; i++) {
  //       newArr[i][0] = newArr[i - 1][0] + matrix[i][0];
  //       }
  //       for (int i = 1; i < newArr.length; i++) {
  //           for (int j = 1; j < newArr[0].length; j++) {
  //             newArr[i][j] = newArr[i][j] + newArr[i][j-1]+newArr[i-1][j] +newArr[i-1][j-1];
  //       }
  //       finalSum = newArr[row2][col2] - newArr[row2][col1-1] - newArr[row1-1][col2] + newArr[row1-1][col1-1];   
  // }
  // return finalSum ;
  // }

public static int [][] preSum ;
public static void NumMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        preSum = new int[n][m];
        preSum[0][0] = matrix[0][0];

        for(int i=1;i<n;i++){
            preSum[i][0] = matrix[i][0] + preSum[i-1][0];
        }
        for(int j=1;j<m;j++){
            preSum[0][j] = matrix[0][j] + preSum[0][j-1];
        }
        for(int i=1;i<n;i++){
          for(int j=1;j<m;j++){
              preSum[i][j] = matrix[i][j] + preSum[i-1][j] + preSum[i][j-1] - preSum[i-1][j-1];
          }
        }
        print(preSum);

      }

    public static int sumRegion(int row1, int col1, int row2, int col2) {
      int result = preSum[row2][col2];
      if(row1>0){
        result = result-preSum[row1-1][col2];
      }
      if(col1>0){
        result = result-preSum[row2][col1-1];
      }
      if(col1>0 && row1>0){
        result = result+preSum[row1-1][col1-1];
      }
      
      return result;
    }

  


  public static void main(String[] args) {
    
    int[][] matrix = {
    {3, 0, 1, 4, 2},
    {5, 6, 3, 2, 1},
    {1, 2, 0, 1, 5},
    {4, 1, 0, 1, 7},
    {1, 0, 3, 0, 5}
    };
    int row1 =1; 
    int col1 = 1;
    int row2 = 2;
    int col2 = 2;
    NumMatrix(matrix);
    System.out.println(sumRegion(row1,col1,row2,col2));
}

public static void print(int[][] arr){

    for (int[] row : arr) {
        for (int value : row) {
            System.out.print(value + "    ");
        }
        System.out.println();
    }
}

}
