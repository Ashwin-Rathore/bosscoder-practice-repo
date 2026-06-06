package BOSSCODER_Sessions.Session_6_2S_Array_30_May;

public class CellsWithOddValuesInAMatrix {

  static public int cell(int m, int n, int[][] indices) {

    int[] rowCount = new int[m];
    int[] colCount = new int[n];

    for (int[] index : indices) {
      rowCount[index[0]]++;
      colCount[index[1]]++;
    }
    int oddRows = 0;
    int evenRows = 0;

    for (int row : rowCount) {
      if (row % 2 == 0) {
        evenRows++;
      } else {
        oddRows++;
      }
    }

    int oddCols = 0;
    int evenCols = 0;

    for (int row : colCount) {
      if (row % 2 == 0) {
        evenCols++;
      } else {
        oddCols++;
      }
    }

     return (oddRows * evenCols) + (evenRows * oddCols);
  }

  public static void main(String[] args) {
    int m = 2;
    int n = 3;
    int[][] indices = { { 0, 1 }, { 1, 1 } };
    System.out.println(cell(m, n, indices));
  }

}
