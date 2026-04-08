class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int highestSellPrice = 0;
        int r = prices.length-1;//s
        int l = 0;//b

        while(l < r){
            if(prices[r] - prices[l] > res){
                highestSellPrice = prices[r];
                res = highestSellPrice - prices[l];
            }
            
            if(prices[l] > prices[r]){
                l++;
            }
            r--;
           
        }
        return res;

    }
}