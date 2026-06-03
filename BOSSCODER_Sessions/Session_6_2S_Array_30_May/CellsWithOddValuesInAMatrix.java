package BOSSCODER_Sessions.Session_6_2S_Array_30_May;

public class CellsWithOddValuesInAMatrix {

      static public int cell(int m,int n,int[][] indices){
        int sum =0;
        int arr[] [] = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = 0;
            }
        }

        // String s = "avd";
        // s.sort


        for(int indRow=0;indRow<indices.length;indRow++){
            for(int indCol=0;indCol<indices[indRow].length;indCol++){
                  if(indices[indRow][indCol] == 1){

                  }

                }
            }
        

       
        // ----- Print -----
        for(int i = 0; i < arr.length; i++) {
    for(int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
}
        // ----- Print -----

        return sum;
      }
  public static void main(String[] args) {
    int m =2;
    int n =3;
    int[][] indices = {{0,1},{1,1}};
    cell(m,n,indices);
  }

}
