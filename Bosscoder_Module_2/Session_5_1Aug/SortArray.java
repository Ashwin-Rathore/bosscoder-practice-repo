package Bosscoder_Module_2.Session_5_1Aug;

public class SortArray {

  public static void print(int[] arr) {
    for (int val : arr)
      System.out.print(val + " ");
  }


  public static int[] sortArrayUsingRecursion(int[] arr) {
    if (arr.length == 1)
      return arr;


    int temp = arr[arr.length - 1];
    // arr.

    return arr;
  }

  public static void main(String[] args) {
    int[] arr = { 5, 4, 3, 2, 1 };
    print(sortArrayUsingRecursion(arr));
  }
}
