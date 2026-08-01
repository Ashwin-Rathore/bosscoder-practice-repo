package Bosscoder_Module_2.Session_4_26Jul;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
  
  public static List<Integer> selfDividing(int left,int right){
    List<Integer> l = new ArrayList<Integer>();

        for(int i=left;i<=right;i++){
            if(i<=12) l.add(i);
            else {
            boolean flag = true;
            int newNum = i;
            while(newNum>1){
                int digit = newNum%10;
                newNum = newNum/10;
                if(i%digit!=0) {
                    flag = false;
                    break;
                }
            }

           if(flag==true) l.add(i);
          }
        }
        return l;
  }

  public static void main(String[] args) {
    
    int left = 12;
    int right = 23;
    System.out.println(selfDividing(left,right));
  }
}
