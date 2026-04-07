class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map =  new HashMap<>();
        for(int i = 0; i < nums.length; i++){
               if(map.containsKey(nums[i])){
                return new int [] {map.get(nums[i]),i};
               } 
               map.put(target - nums[i],i); 
                //Map what is left as THE KEY 
                // Map i AS VALUE
            }
            return new int[] {};
        }
    }

