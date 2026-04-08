class Solution {
    public int maxSubArray(int[] nums) {
        int res = 0;
        if(nums.length == 1){
            return nums[0];
        }

        for(int i = 0; i < nums.length; i++){
            res += nums[i];
            if(res < nums[i]){
                res = nums[i];
            }
            // System.out.println(res + " number was " + nums[i]);
        }

        return res;
    }
}
