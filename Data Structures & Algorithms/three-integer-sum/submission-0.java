class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                for(int k = 0; k < nums.length; k++){
                   if(nums[i] + nums[j] + nums[k] == 0 && i != j && i != k && j != k){
                        List<Integer> innerList = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
                        Collections.sort(innerList);
                        if(!res.contains(innerList)){
                            res.add(innerList);
                        }
                   } 
                }
                
            }
        }

        return res;
    }
}
