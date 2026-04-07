class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        dfs(nums, new ArrayList<Integer>());
        return res;
    }

    void dfs(int[] nums, List<Integer> subset){

        if(subset.size() == nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }

        for (int j = 0; j < nums.length; j++) {
            if(!subset.contains(nums[j])){
                subset.add(nums[j]);
                dfs(nums, subset);
                subset.remove(subset.size() - 1);
            }
        }

    }
}
