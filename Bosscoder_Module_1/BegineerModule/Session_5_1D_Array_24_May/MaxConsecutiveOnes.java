package Bosscoder_Module_1.BegineerModule.Session_5_1D_Array_24_May;

public class MaxConsecutiveOnes {

  public static int ConsecutiveOnes(int[] nums){
    int count = 0;
    int newCount =0;
        for(int i=0;i<nums.length;i++){
            
                if(nums[i]==1){
                    newCount++;
                        if(count<newCount){
                        count = newCount;
                       // System.out.print("Count & New Count : "+count +" "+newCount);
                        }
                   // System.out.print(newCount +" ");
                }
                else{
                    System.out.println();
                        newCount = 0;
                    }
    
         }   

    return count;
  }

  public static void main(String[] args) {
    
    int[] nums = {1,1,0,1,1,1};
    System.out.println(ConsecutiveOnes(nums));
  }
}
