class Solution {
    public int findMin(int[] nums) {
        int r = nums.length-1;
        int l = 0;
        int res = Integer.MAX_VALUE;

        while(l < r){
            int m = (l+r) / 2;
            if(nums[l] < nums[m]){
                l = m+1;
            }else if(nums[r] > nums[m]){
                r = m-1;
            }
            res = Math.min(res, nums[m]);
        }

        return res;

        
    }
}
