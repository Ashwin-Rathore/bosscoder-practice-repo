package Bosscoder_Module_1.BegineerModule.Session_9_10_11_Searching_14_June;

public class Two_Sum_II_InputArrayIsSorted {

  public static int[] twoSum(int[] numbers, int target) {
    int[] arr = {-1,-1};
    int lo = 0;
    int hi = numbers.length-1;

    while(lo<hi){
      //int mid = hi - (hi-lo)/2;

      if(numbers[lo]+numbers[hi]==target){
        arr[0] = lo+1;
        arr[1] = hi+1;
        break;
      }else if (numbers[lo]+numbers[hi]>target) {
          hi = hi-1;
      }else lo = lo+1;

    }


    return arr;
    
  }

  public static void main(String[] args) {
    int[] numbers = { 2, 7, 11, 15 };
    int target = 9;
    System.out.println(twoSum(numbers, target));
  }
}
