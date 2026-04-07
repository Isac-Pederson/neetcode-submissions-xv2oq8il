class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        
        Arrays.sort(nums);

        for(int curr = 0; curr < nums.length; curr++){
                int left = 0;
                int right = nums.length-1;
                    while(left < right){
                        if(curr == left){
                            left++;
                            continue;
                        }
                        if(curr == right){
                            right--;
                            continue;
                        }
                        if(-nums[curr] == nums[left] + nums[right]){
                            List<Integer> innerList = new ArrayList<>(Arrays.asList(nums[curr], nums[left], nums[right]));
                            Collections.sort(innerList);
                            if(!res.contains(innerList)){
                                res.add(innerList);
                            }
                            left++;
                            right--;
                        }else if(-nums[curr] > nums[left] + nums[right]){
                            left++;
                        }else{
                            right--;
                        }
                    }

            
        }

        return res;
    }
}
