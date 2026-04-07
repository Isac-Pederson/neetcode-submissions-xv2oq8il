class Solution {
    public int maxProfit(int[] prices) {
        int highestSellPrice = 0;
        int s = 0;//s
        int b = 0;//b

            if(prices.length == 1){
                return 0;
            }

            while(s < prices.length-1){
                if(prices[s] >= prices[b]){
                    s++;
                }
                if(prices[s] - prices[b] > highestSellPrice){
                    highestSellPrice = prices[s] - prices[b];
                }
                if(prices[s] < prices[b]){
                    b = s;
                }
            }
           
        return highestSellPrice;

    }
}