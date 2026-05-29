package BOSSCODER_Sessions.Session_5_1D_Array_24_May;

public class BestTimeToBuyAndSellStock {

      static public int bestTime(int [] prices){
          int maxProfit = 0;
          int minPrice = prices[0];
          for(int i=0;i<prices.length;i++){
              if(prices[i]< minPrice){
                  minPrice = prices[i];
              }
              int profit = prices[i]-minPrice;
                if(maxProfit<profit){
                    maxProfit = profit;
                }
          }





        return maxProfit;
      }

  public static void main(String[] args) {
      int [] prices = {7,1,5,3,6,4};

     System.out.println( bestTime(prices));


  }
  
}
