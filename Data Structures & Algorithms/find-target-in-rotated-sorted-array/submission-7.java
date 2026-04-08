class Solution {
    public int search(int[] nums, int target) {
        int r = nums.length-1;
        int l = 0;
        int res = -1;

        while(l <= r){
            int m = (l+r) / 2;
            if(nums[l] <= nums[m]){
                if(nums[l] <= target && target < nums[m] ){
                    r = m-1;
                }else{
                    l=m+1;
                }
            }
            if(nums[r] >= nums[m]){
                if(nums[m] <= target && target < nums[r]){
                    l = m+1;
                }else{
                    r=m-1;
                }
            }
            if(nums[m] == target){
                res = m;
                return res;
            }

   
        }

        

        return res; 
    }
}
