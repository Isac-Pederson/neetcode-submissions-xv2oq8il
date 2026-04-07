class Solution {
    public int maxProfit(int[] prices) {
        int sellPrice = 1; //R
        int buyPrice = 0; //L
        int maxProfit = 0;

        while(sellPrice < prices.length){
            if(prices[buyPrice] < prices[sellPrice]){
                int profit = prices[sellPrice] - prices[buyPrice];
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = sellPrice ;
            }
            sellPrice += 1;
        }
        return maxProfit;
    }
}