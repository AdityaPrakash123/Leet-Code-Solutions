public class BestTimeToBuyAndSellStock{
  public int maxProfit(int[] prices) {
        if(prices.length==1){
            return 0;
        }
        int res = prices[1]-prices[0];
        int minVal = prices[0];

        for(int i=1;i<prices.length;i++){
            if(prices[i]-minVal>res){
                res = prices[i]-minVal;
            }

            if(prices[i]<minVal){
                minVal = prices[i];
            }
        }
        return res>0?res:0;
    }
}  
  
