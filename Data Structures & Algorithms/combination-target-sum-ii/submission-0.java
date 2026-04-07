class Solution {
    Set<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new HashSet<>();
        Arrays.sort(candidates);
        dfs(candidates, target, new ArrayList<>(), 0, 0);
        List<List<Integer>> resc = new ArrayList<>(res);
        return resc;
    }


    void dfs(int[] nums, int target, List<Integer> subset, int i, int total){
        if(total == target){
            res.add(new ArrayList<>(subset));
        }

        for(int j = i; j < nums.length; j++){
            if(nums[j] + total > target){
                return;
            }
            subset.add(nums[j]);
            dfs(nums,target,subset,j+1,nums[j] + total);
            subset.remove(subset.size()-1);
        }

    }
}
