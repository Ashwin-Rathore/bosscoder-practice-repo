package BOSSCODER_Sessions.Session_13_Sort_27_June;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class CommonElement {

    public static ArrayList<Integer> findCommonElement(int[] a,int[] b){
      ArrayList l = new ArrayList<>();
     
        Arrays.sort(a);
        Arrays.sort(b);
        int aLen = a.length-1;
        int bLen = b.length-1;
        int i=0,j=0;
        while(i<aLen && j<bLen){
            if(a[i]==b[i]){
              l.add(a[i]);
              i++;
              j++;
            }else if(a[i]<b[i]){
                i++;
            }else j++;

        }

      return l;
    }

  public static void main(String[] args) {
    int [] a = {3,4,2,2,4};
    int [] b = {3,2,2,7};
    System.out.println(findCommonElement(a,b));
  }
}
