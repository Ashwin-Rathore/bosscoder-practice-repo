package BOSSCODER_Sessions.Session_5_1D_Array_24_May;

public class SegrigateAllZeros {

  public static void print(int[] arr) {
    for (int val : arr) {
      System.out.print(val + " ");
    }
    System.out.println();
  }

  public static int[] allZeros(int[] arr) {

    int l = 0;
    int r = arr.length - 1;
    while (l < r) {
      if (arr[l] == 1) {
        if (arr[r] == 0) {
          int temp = arr[l];
          arr[l] = arr[r];
          arr[r] = temp;
          l++;
          r--;
        } else
          r--;
      } else
        l++;

    }

    return arr;
  }

  public static void main(String[] args) {

    int[] arr = { 0,0,1,0 };
    print(arr);
    System.out.println();
    print(allZeros(arr));
  }
}
