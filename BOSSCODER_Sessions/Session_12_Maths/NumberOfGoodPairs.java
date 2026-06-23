package BOSSCODER_Sessions.Session_12_Maths;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {

  public static int factorial(int n){
    int fact = 1;

      while(n>=1){
        fact = fact*n; 
        n--;
      }

    return fact;
  }

  public static int ncr (int n){
    int result = 1;
      //result = factorial(n)/(factorial(n-2) * factorial(2));
      result = n * (n - 1) / 2;

    return result;
  }


    public static int goodPair(int []nums){
      int output = 0;

      Map<Integer,Integer> hm = new HashMap<>();

      for(int i=0;i<nums.length;i++){       
          if(hm.containsKey(nums[i])) hm.put(nums[i], hm.get(nums[i])+1);
          else hm.put(nums[i], 1);
      }
        System.out.println(hm);
int i=1;
        for(int value : hm.values()){
          
          System.out.println("value : "+i+": "+ value+":  "+ncr(value));
          i++;
        output = output + ncr(value);
      }  


      return output;
    }

  public static void main(String[] args) {
     int[] nums = {6,5,1,5,7,7,9,1,5,7,1,6,10,9,7,4,1,8,7,1,1,8,6,4,7,4,10,5,3,9,10,1,9,5,5,4,1,7,4,2,9,2,6,6,4,2,10,3,5,3,6,4,7,4,6,4,4,6,3,4,10,1,10,6,10,4,9,6,6,4,8,6,9,5,4};
    System.out.println("Output : "+goodPair(nums));
    System.out.println(factorial(5));
    System.out.println("NCR : "+ncr(5));
  }
}
