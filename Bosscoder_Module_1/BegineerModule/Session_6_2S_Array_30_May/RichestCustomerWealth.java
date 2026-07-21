package Bosscoder_Module_1.BegineerModule.Session_6_2S_Array_30_May;

public class RichestCustomerWealth {

      static public int richCustomer(int [][] accounts){
          int money =0;
            for(int i=0;i<accounts.length;i++){
                int sum =0;
                for(int j=0;j<accounts[i].length;j++){
                      sum = sum+ accounts[i][j];
                }
                  if(sum>money){
                      money = sum;
                  }
            }

          return money;
              
      }

  public static void main(String[] args) {
    int [][] accounts = {{1,5},{7,3},{8,1}}  ;

      System.out.println(richCustomer(accounts));

  }
  
}
