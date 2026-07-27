package Bosscoder_Module_2.Session_3_25Jul;

public class kthBitShift {
  
  public static boolean kthBit(int n,int k){
   
    if((n>>k)%2==0) return false;
    else return true;

  }
  public static void main(String[] args) {
    int n =27818;
    int k = 1;
    System.out.println(kthBit(n,k));
  }
}
