class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        if(nums == null || nums.length == 0){
            return 0;
        }

        for(int n : nums){
            set.add(n);
        }

        int longest = 1;
        int result = 1;

        for(int number : set){
            if(set.contains(number - 1)){
                continue;
            }
            while(set.contains(number + 1)){
                longest++;
                number = number+1;
            }
            result = Math.max(longest,result);
        }

        return result;

        



        
    }
}
