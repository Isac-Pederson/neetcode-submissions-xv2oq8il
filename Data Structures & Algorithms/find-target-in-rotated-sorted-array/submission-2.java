class Solution {
    public int search(int[] nums, int target) {
        int r = nums.length-1;
        int l = 0;
        int res = -1;

        while(l <= r){
            int m = (l+r) / 2;
            if(nums[m] > nums[r] && target < nums[m]){
                l = m+1;
            }
            else if(nums[m] < nums[r] && target > nums[m]){
                l = m+1;
            }
            else{ 
                 r = m-1;
                 System.out.println(nums[m]);
                if(nums[m] == target){
                    res = m;
                }
            }

        }

        return res; 
    }
}
