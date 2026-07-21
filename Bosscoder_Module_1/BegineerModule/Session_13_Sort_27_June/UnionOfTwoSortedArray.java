package Bosscoder_Module_1.BegineerModule.Session_13_Sort_27_June;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class UnionOfTwoSortedArray {

  // public static ArrayList SortedArrayUnionUsingTreeSet(int[]a,int[]b){
  // ArrayList<Integer> l = new ArrayList<>();
  // TreeSet<Integer> h = new TreeSet<>();
  // int al = a.length;
  // int bl = b.length;
  // //int i=0,j=0;
  // for(int val : a){
  // h.add(val);
  // }
  // for(int val : b){
  // h.add(val);
  // }
  // System.out.println(h);
  // return l;
  // }

  public static ArrayList SortedArrayUnionUsing2Pointer(int[] a, int[] b) {
    ArrayList<Integer> list = new ArrayList<>();
    int al = a.length;
    int bl = b.length;
    int i = 0, j = 0;

    while (i < al && j < bl) {

      if (a[i] == b[j]) {
        list.add(a[i]);
        i++;
        j++;
      } else if (a[i] < b[j] ) {
        if(list.isEmpty() || list.get(list.size() - 1) != a[i] ) list.add(a[i]);
        i++;
      } else {
        j++;
      }
    }

    while(i<al){
    list.add(a[i]);
    i++;
    }
    while(j<bl){
    list.add(b[j]);
    j++;
    }

    return list;
  }

  public static void main(String[] args) {
    int[] a = { 1, 2, 2, 3, 4, 5 };
    int[] b = { 1, 2, 3, 6, 7 };
    System.out.println(SortedArrayUnionUsing2Pointer(a, b));
    // System.out.println(SortedArrayUnionUsingTreeSet(a,b));
  }
}
