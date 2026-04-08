class Solution {
    public int findDuplicate(int[] nums) {

        for(int i = 0; i < nums.length; i++){
            nums[Math.abs(nums[i]) - 1] *= -1;

            if(nums[i] > 0){
                return nums[i];
            }
        }
        return 0;
    }
}
