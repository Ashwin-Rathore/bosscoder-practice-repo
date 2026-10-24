package Bosscoder_Module_2.Session5_8Aug;

import java.util.HashMap;
import java.util.Map;

public class CountingSort {
  
public static int[] countingSort(int[] arr) {
        int min = minElement(arr);
        int max = maxElement(arr);
        int [] finalArray = new int[arr.length];
        int[] freqSum = new int[arr.length];
        //System.out.println(min+" -- "+ max);
        Map<Integer, Integer> result = freqTable(arr);
        freqSum = freqSum(result);
        
        // for(int i=0;i<arr.length;i++){
        //   finalArray[i] = freqSum[arr[i]];
        //   freqSum[arr[i]]--;
          
        // }

        
        print(freqSum);
        return finalArray;

    }

    public static int[] freqSum(Map<Integer, Integer> hm) {
        int[] arr = new int[hm.size()];

        int sum = 0;
        int i = 0;

        for (int freq : hm.values()) {
            sum += freq;
            arr[i] = sum;
            i++;
        }

        return arr;
    }

    public static Map<Integer, Integer> freqTable(int[] arr) {
        Map<Integer, Integer> hm = new HashMap<>();

        for (int val : arr) {
            if (hm.containsKey(val)) {
                hm.put(val, hm.get(val) + 1);
            } else {
                hm.put(val, 1);
            }
        }

        return hm;
    }

    public static int minElement(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int val : arr) {
            if (min > val)
                min = val;
        }
        return min;
    }

    public static int maxElement(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int val : arr) {
            if (max < val)
                max = val;
        }
        return max;
    }
    public static void print(int[]arr){
      for(int val :arr) System.out.print(val +" ");
      System.out.println();
    }
  public static void main(String[] args) {
    
    int[] arr = {2,4,8,9,5,4, 5};
    print(arr);
    print(countingSort(arr));
  }
}
