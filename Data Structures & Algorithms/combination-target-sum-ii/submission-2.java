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

        for(int j = i; j < nums.length; j++){
            if(j > i && nums[j] == nums[j-1]){
                continue;
            }
            if(total + nums[j] > target){
                break;
            }

            subset.add(nums[j]);
            dfs(nums,target,subset,j+1,total +nums[j]);
            subset.remove(subset.size() -1);
        }
    }
}
