class Solution {
    public int findDuplicate(int[] nums) {

        for(int i = 0; i < nums.length; i++){
            if(nums[Math.abs(nums[i]) - 1] < 0){
                if(nums[i] < 0){
                    nums[i] *= -1;
                }
                return nums[i];
            }

            nums[Math.abs(nums[i]) - 1] *= -1;

        }
        return 0;
    }
}
