class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        dfs(nums, target, subset, 0, 0);
        return res;
    }

    void dfs(int[] nums, int target, List<Integer> subset, int i, int total){
        if(total == target){
            res.add(new ArrayList<>(subset));
            return;
        }
        for(int j = i; j < nums.length; j++ ){
            if(total + nums[j]> target){ 
                return;
            }
            subset.add(nums[j]);
            dfs(nums, target, subset, j, total + nums[j]);
            subset.remove(subset.size()-1);
        }


    }
}
