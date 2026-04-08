class Solution {
    public int maxSubArray(int[] nums) {
        int res = 0;
        int max = 0;
        if(nums.length == 1){
            return nums[0];
        }

        for(int i = 0; i < nums.length; i++){
            System.out.println("BEFORE: " + res + " AFTER: "+ (res + nums[i]) + " NUM WAS: " + nums[i] );
            res += nums[i];
            if(res < nums[i]){
             System.out.println( "res is now " + nums[i]);
                res = nums[i];
            }
            if(res > max){
                max = res;
            }
        }

        return max;
    }
}
