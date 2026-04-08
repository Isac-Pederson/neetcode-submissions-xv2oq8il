class Solution {
    public int search(int[] nums, int target) {
        int r = nums.length-1;
        int l = 0;
        int res = -1;

        while(l <= r){
            int m = (l+r) / 2;
            if(nums[l] <= target && target < nums[m]){
                r = m-1;
                System.out.println("RIGHT: " + r );
            }
            else{
                l = m+1;
                System.out.println("LEFT: " + l);

            }
            if(nums[m] == target){
                res = m;
            }

   
        }

        

        return res; 
    }
}
