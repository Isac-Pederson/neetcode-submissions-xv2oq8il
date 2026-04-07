class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        bt(nums,new ArrayList<>());
        return res;
    }

    void bt(int[] nums, List<Integer> sub){
        if(sub.size() == nums.length){
            res.add(new ArrayList<>(sub));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(!sub.contains(nums[i])){
                sub.add(nums[i]);
                bt(nums,sub);
                sub.remove(sub.size()-1);
            }
        }

    }
}
