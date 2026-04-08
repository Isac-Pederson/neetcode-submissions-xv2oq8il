class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int highestSellPrice = 0;
        int r = prices.length-1;//s
        int l = 0;//b

        while(l < r){
            if(prices[r] > highestSellPrice ){
                highestSellPrice = prices[r];
                System.out.println("SELL PRICE: " + highestSellPrice);
            }
            if(highestSellPrice - prices[l] > res){
                res = highestSellPrice - prices[l];
                System.out.println("BUY PRICE: " + prices[l]);
                System.out.println("RESULT : " + res);
            }
                l++;
                r--;
        }
        return res;

    }
}