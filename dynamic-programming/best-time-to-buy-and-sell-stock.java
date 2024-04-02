class Solution {
    public int maxProfit(int[] prices) {
        
        int buy,sell,profit=0;

        buy = prices[0];
        sell = prices[0];

        for(int i=1;i<prices.length;++i){
            if(prices[i] < buy){
                buy = prices[i];
                sell = prices[i];
                profit = Math.max(profit,0);
            }
            if(prices[i] > sell){
                sell = prices[i];
                profit = profit = Math.max(profit,sell - buy);
            }
        }

        return profit;
    }
}