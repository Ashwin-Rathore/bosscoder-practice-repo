package Bosscoder_Module_1.BegineerModule.Session_5_1D_Array_24_May;

public class MergeSortedArray {

    

   static public void merge(int[] nums1, int m, int[] nums2, int n) {

    for(int i=0;i<nums1.length-1;i++){
          for(int j=0;j<nums2.length-1;j++){

            if(nums1[i]>nums2[j]){
                nums1[i+1] = nums1[i];
                nums1[i] = nums2[j];
                j++;
            }
          
          }
          System.out.print(nums1[i]+" ");
          
    }
    // for(int i=0;i<nums1.length-1;i++){
        
    //   }

   }

   public static void main(String[] args) {
    
    int[] nums1 = {1,2,3,0,0,0};
    int m = 3;
    int[]  nums2 = {2,5,6};
    int n = 3;

    merge(nums1,m,nums2,n);
      
    
   }
  
}
