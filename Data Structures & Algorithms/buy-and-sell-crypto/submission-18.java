class Solution {
    public int maxProfit(int[] prices) {
        int m = 0;
        int s = 1; //sell
        int b = 0; //buy

        while(s <= prices.length-1){
           if(prices[b] >= prices[s]){
                b = s;
           }
           m = Math.max(m, prices[s]  - prices[b]);  
            s++;
         

        }

        return m;        
    }
}
