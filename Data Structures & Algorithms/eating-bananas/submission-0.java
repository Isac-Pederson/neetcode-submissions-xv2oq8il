class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int r = piles[0];
        int res = 0;

        for(int i = 0; i < piles.length; i++){
           if(piles[i] > r){
                r = piles[i];
           } 
        }

        int l = 1;

        while(l <= r){
            int k = (l+r) / 2;
            int hours = 0;
            for(int banCount : piles){
                hours += Math.ceil( (double) banCount/ (double) k);
            }
            if(hours <= h){
                res = k;
                r = k-1;
            }else{
                l = k+1;
            }
        }

        return res;

            
        }
}
