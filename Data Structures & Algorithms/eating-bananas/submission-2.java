class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int r = 0;

        for(int i = 0; i<piles.length; i++){
            r = Math.max(r, piles[i]);
        }

        int l = 0;
        int res = Integer.MAX_VALUE;

        while(l<=r){
            int k = (l+r)/2;
            double hours = 0;

            for(int i = 0; i<piles.length; i++){
                hours = hours + (double) Math.ceil((double)piles[i] / (double) k);
            }
            if(hours > h){
                l = k+1;
            }else{
                r = k-1;
                res = Math.min(res,k);
            }
        }

        return res;





        
    }
}
