package Bosscoder_Module_2.Session_1_18Jul;

public class TrappingRainWater {

    public static int findWater(int []height){
      int result = 0;
      int len = height.length;

      for(int i=1;i<len-1;i++){
         
        int leftMax = height[i];
        int left = i-1;
        while(left>=0){
          leftMax = Math.max(leftMax, height[left]);
          left--; 
        }

        int rigthMax = height[i];
        int right = i+1;
        while (right<len) {
          rigthMax = Math.max(rigthMax, height[right]);
          right++;
          
        }

        result = result + Math.min(leftMax, rigthMax) - height[i];

      }

      return result;
    }

  public static void main(String[] args) {
    int [] height = {4,2,0,3,2,5};
    System.out.println(findWater(height));
  }
}
