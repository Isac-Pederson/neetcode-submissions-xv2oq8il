class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;

        for(int i = 0; i<prices.length; i++){
            for(int j = 0; j < prices.length; j++){
                if(prices[j] - prices[i] > res && j>i){
                    res = prices[j] - prices[i];
                }        
            }
        }

        return res;
    }
}