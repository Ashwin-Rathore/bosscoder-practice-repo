package Bosscoder_Module_1.BegineerModule.Session_8_NumberSystem_BitManipulation_13_June;

import java.util.ArrayList;
import java.util.List;

public class SumXorAllSubsets {

  static public List<List<Integer>> allSubSets(int []arr){
    List<List<Integer>> finalList = new ArrayList<>();
    int n = arr.length;
    int m = (1<<n);
    for(int i=0;i<m;i++){

        List<Integer> newList = new ArrayList<>();
          for(int j=0;j<n;j++){
              if((i>>j)%2==1) newList.add(arr[j]);
          }
          finalList.add(newList);
    }
    


    return finalList;
  }

  public static void main(String[] args) {
    int[] arr = {1, 5, 6};
    System.out.println(allSubSets(arr));
  }
}
