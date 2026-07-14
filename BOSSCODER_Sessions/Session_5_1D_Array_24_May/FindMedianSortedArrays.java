package BOSSCODER_Sessions.Session_5_1D_Array_24_May;

import java.util.Arrays;

public class FindMedianSortedArrays {

  public static double findMedianSortedArrays(int[] num1, int[] num2) {
    double median = 0;
    int[] arr = new int[num1.length + num2.length];
    System.arraycopy(num1, 0, arr, 0, num1.length);
    System.arraycopy(num2, 0, arr, num1.length, num2.length);
    System.out.println(Arrays.toString(arr));
    Arrays.sort(arr);
    
     int mid = arr.length / 2;
    if ((arr.length & 1) == 1) { // 231
      median = arr[mid];
    } else {
      System.out.println("arr[mid] : " + arr[mid]);
      System.out.println("arr[mid+1] : " + arr[mid + 1]);
      median = (arr[mid-1] + arr[mid]) / 2.0f;
    }
    return median; //121
  }

  public static void main(String[] args) {

    int[] nums1 = { 1, 3 };
    int[] nums2 = { 2, 4 };

    System.out.println(findMedianSortedArrays(nums1, nums2));
  }
}
