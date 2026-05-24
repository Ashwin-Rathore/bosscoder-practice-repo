package BOSSCODER_Sessions.JavaPracticeExecution;

public class ReturningArray {

  public static void main(String[] args) {
    
  
  int [] nums = {2,5,1,3,4,7};
  int n = 3;
  int [] newNum = new int[n*2];

  
    for(int i=0;i<n;i++){

          newNum[2*i] = nums[i];
          newNum[2*i+1] = nums[i+n];

    }
    for(int i=0;i<n*2;i++){
    System.out.print( newNum[i]+" ");
    }




}
}