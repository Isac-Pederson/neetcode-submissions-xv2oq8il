class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res =  new ArrayList<>();


        for(int i = 0; i < nums.length; i++){
            int l = i+1;
            int r = nums.length-1;
            if(i > 0 && nums[i] == nums[i-1]) continue; 

                //dupe check

            while(l < r){

               int sum  = nums[i] + nums[l] + nums[r];

               if(sum > 0){
                r--;
               }else if(sum < 0){
                l++;
               }else{
                //match found
                res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                l++;
                r--;
                //dupe check
                while(l < r && nums[l] == nums[l-1]){
                    l++;
                }
               }
            }


        }

        return res;
    }
}
