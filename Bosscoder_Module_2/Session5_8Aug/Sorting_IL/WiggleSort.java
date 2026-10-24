package Bosscoder_Module_2.Session5_8Aug.Sorting_IL;

public class WiggleSort {
  
    public int[] sort(int[] nums){
       if (nums.size() < 2) { return; } 
        for (int i = 0; i <= nums.size() - 2; i++) {
        if ((i % 2 == 0 && nums[i] > nums[i+1]) || (i % 2 != 0 && nums[i] < nums[i+1])) {
            swap(nums[i], nums[i+1]);
            }
    }


      return arr;
    }

  public static void main(String[] args) {
    int num[] = {3,5,2,1,6,4};
  }
}

//  if (nums.length < 2) { return; } 
//         for (int i = 0; i <= nums.length - 2; i++) {
//         if ((i % 2 == 0 && nums[i] >= nums[i+1]) || (i % 2 != 0 && nums[i] <= nums[i+1])) {
//             swap(nums[i], nums[i+1]);
//     }
//         }