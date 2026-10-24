package Bosscoder_Module_2.Session5_8Aug;

import java.util.HashMap;
import java.util.Map;

public class BubbleSort {

  public static void print(int[] arr) {
    for (int val : arr) {
      System.out.print(val + " ");
    }
  }

  public static int[] sort(int[] arr) {

    int n = arr.length - 1;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

    Map<Integer, Integer> hm = new HashMap();
    for (int val : arr) {
      if (hm.containsKey(val)) {
        hm.put(val, hm.get(val) + 1);
      } else {
        hm.put(val, 1);
      }

    }

    return arr;
  }

  public static void main(String[] args) {
    int[] arr = { 6, 5, 4, 3, 2, 1 };
    print(sort(arr));
  }
}
