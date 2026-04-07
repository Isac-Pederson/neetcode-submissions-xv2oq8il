class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int s = 1;
        int b = 0;

        while(s < prices.length){
            if(prices[s] > prices[b]){
                max = Math.max(max, prices[s] - prices[b]);
            }
            else{
                b = s;
            }
            s++;
        }

        return max;
        
    }
}
