package BOSSCODER_Sessions.JavaExecution;

public class AddinfArray {

  public static void main(String[] args) {
    
    int [] nums = {1,2,3,4};

    int [] newArr = new int[nums.length];

        int sum = 0;
        for(int i=0;i<nums.length;i++){
        

            // for(int j=0;j<=i;j++){
            //     sum = sum+nums[j];
            // }
            //   newArr[i]=sum;

          sum = sum+nums[i];
          newArr[i] = sum;

        }
        for(int i=0;i<newArr.length;i++){
          System.out.print( newArr[i]+" ");
        }

  }
  
}
