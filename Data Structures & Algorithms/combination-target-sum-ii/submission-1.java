class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, target, new ArrayList<>(), 0, 0);
        return res;
    }


    void dfs(int[] nums, int target, List<Integer> subset, int i, int total){
        if(total == target){
            res.add(new ArrayList<>(subset));
            return;
        }

        if(total > target || i == nums.length){
            return;
        }
        subset.add(nums[i]);
        dfs(nums,target,subset,i+1,nums[i] + total);
        subset.remove(subset.size()-1);

        while(i + 1 < nums.length && nums[i] == nums[i+1]){
            i++;
        }
        dfs(nums, target, subset, i+1, total);

    }
}
