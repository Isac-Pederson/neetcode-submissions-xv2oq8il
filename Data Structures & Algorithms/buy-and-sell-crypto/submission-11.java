class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int highestSellPrice = 0;
        int r = prices.length-1;//s
        int l = 0;//b

        while(l < r){
            int profit = highestSellPrice - prices[l];
            if(prices[l] > prices[r]){
                l++;
            }
            if(prices[r] - prices[l] > profit){
                highestSellPrice = prices[r];
            }
            r--;
            if(res < profit) res = profit;
           
        }
        return res;

    }
}