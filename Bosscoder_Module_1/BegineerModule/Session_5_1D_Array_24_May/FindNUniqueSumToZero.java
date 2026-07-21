package Bosscoder_Module_1.BegineerModule.Session_5_1D_Array_24_May;

import java.util.ArrayList;

public class FindNUniqueSumToZero {

  static public int[] singleArr(int num){
    ArrayList<Integer> list = new ArrayList<>();

      for(int i =1;i<=Math.floor(num/2);i++){
          list.add(i);
          list.add(-i);
      }
        if(num%2!=0){
            list.add(0);
        }

    int[] arr = new int[list.size()];
    for(int i=0;i<list.size();i++){
        arr[i] = list.get(i);
        System.out.print (arr[i]+" ");
    }


    return arr;
};



  
  public static void main(String[] args) {

    singleArr(5);
  }
  
}
