class Solution {
    public int maxProfit(int[] prices) {
        int b = 0;
        int s = 1;
        int profit = 0;

        while(s < prices.length){
            if(prices[s] > prices[b]){
                profit = Math.max(profit, prices[s] - prices[b]);
            }else{
                b = s;
            }
            s++;
        }

        return profit;

    }
}
