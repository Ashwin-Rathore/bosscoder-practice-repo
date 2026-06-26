package BOSSCODER_Sessions.Session_5_1D_Array_24_May;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingleNumberIII {

  public static int[] singleNumber(int[] nums) {
    int[] ans = {-1,-1};

      if(nums.length==2 && nums[0]!=nums[1]) return nums;
      //List<Integer> list = new ArrayList<Integer>();
      Map<Integer,Integer> map = new HashMap<>();
          for(int i=0;i<nums.length;i++){
             if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
             }else
              map.put(nums[i],1 );
          } 
          
          int index = 0;

          for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
            ans[index++] = entry.getKey();
            }
          }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr = {1,2,1,3,2,5};
    System.out.println(singleNumber(arr)[0]+" "+singleNumber(arr)[1]);
  }
}
