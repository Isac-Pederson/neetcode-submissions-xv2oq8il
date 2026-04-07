class Solution {
    public int maxProfit(int[] prices) {
        int s = 1;
        int b = 0;
        int maxP = 0;

        while(s < prices.length){
            if(prices[s] > prices[b]){
                maxP = Math.max(maxP, prices[s] - prices[b]);
            }
            else{
                b = s;
            }
            s++;
        }

        return maxP;
        
    }
}
