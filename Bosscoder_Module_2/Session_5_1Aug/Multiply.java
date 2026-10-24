package Bosscoder_Module_2.Session_5_1Aug;

public class Multiply {

  public static int multiplyRec(int a,int b)
{

  if(b==0 || a==0) return 0;
  return  a + multiplyRec(a, b-1);
}



  public static void main(String[] args) {
    int a = 10;
    int b = 5;
    System.out.println(multiplyRec(a,b));
  }
  
}
