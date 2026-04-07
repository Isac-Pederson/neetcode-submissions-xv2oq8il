//do I need an index? (for loop or none?)
//do I need to sort? (duplicates)

class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        res = new ArrayList<>();
        Arrays.sort(nums); 
        bt(nums, new ArrayList<>(),0);
        return res;
    }

    void bt(int[] nums, List<Integer> sub, int i){
        if(i == nums.length){
            res.add(new ArrayList<>(sub));
            return;
        }

        sub.add(nums[i]);
        bt(nums,sub,i+1);
        sub.remove(sub.size()-1);
        while(i+1 < nums.length && nums[i] == nums[i+1]){
            i++;
        }
        bt(nums,sub, i+1);
    }
}
