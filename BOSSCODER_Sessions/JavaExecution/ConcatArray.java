package BOSSCODER_Sessions.JavaExecution;

public class ConcatArray {
  public static void main(String[] args) {
    
  
   int[] nums = {1,2,3}  ;

    int[] newArr = new int[nums.length*2];
        for(int i =0;i<nums.length;i++){
                newArr[i] = nums[i];
                newArr[i] = nums[i];         
        
        for(int j=0;j<newArr.length;j++){
          System.out.print(newArr[j]+" ");
        }
}
  }
}

