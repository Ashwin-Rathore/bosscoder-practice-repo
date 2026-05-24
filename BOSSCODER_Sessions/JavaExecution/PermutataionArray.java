package BOSSCODER_Sessions.JavaExecution;

public class PermutataionArray {
    public static void main(String[] args) {
      
      int[] nums = {5,0,1,2,3,4}  ;
      int[] newNum = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            newNum[i] = nums[nums[i]];
        }
    }
}
