package BOSSCODER_Sessions.JavaExecution;

public class ReverseArray {

  public static void main(String[] args) {
    
    int[] arr = {1,2,3,4,5,6};
    for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
    System.out.println();

      for(int i=0;i<arr.length/2;i++){   // OR for(int i=0;2*i<arr.length;i++){ 

         int temp = arr[i];
         arr[i] = arr[arr.length-i-1];
        arr[arr.length-i-1] = temp;
      }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");

  }
  
}}
