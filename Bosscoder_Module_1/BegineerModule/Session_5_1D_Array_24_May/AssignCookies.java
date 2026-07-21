package Bosscoder_Module_1.BegineerModule.Session_5_1D_Array_24_May;

public class AssignCookies {
  
  public static int AssignCooky(int[] g, int[] s){
      int count =0;
      for(int i=0;i<g.length;i++){

        if(i>g.length-1) return count;
            for(int j=0;j<s.length;j++){

            if(i>g.length-1 || j> s.length-1) return count;
            
            if(s[i]>=g[j]) count++;
        }
   
    }
    return count;
  }


  public static void main(String[] args) {
    
    int[] g ={1,2,3};
    int[] s = {1,1};
    System.out.println(AssignCooky(g,s));
  }
}
