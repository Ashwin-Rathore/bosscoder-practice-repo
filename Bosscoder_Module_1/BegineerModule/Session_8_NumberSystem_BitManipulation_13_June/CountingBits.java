package Bosscoder_Module_1.BegineerModule.Session_8_NumberSystem_BitManipulation_13_June;

public class CountingBits {

  static public int[] countBits(int n) {
    int[] arr = new int[n + 1];
    for (int i = 0; i <= n; i++) {
      int temp = i;
      int counter = 0;
      while (temp > 0) {
        if (temp % 2 != 0) {
          counter++;
        }
        temp = temp / 2;
      }
      arr[i] = counter;
    }

    for (int i = 0; i <= n; i++) {
      System.out.println(arr[i]);
    }

    return arr;
  }

  public static void main(String[] args) {
    int n = 5;
    System.out.println(countBits(n));
  }
}
