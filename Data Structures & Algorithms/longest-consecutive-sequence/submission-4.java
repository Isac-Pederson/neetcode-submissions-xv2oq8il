class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int res = 0;

        for(int n : nums){
            set.add(n);
        }

        for(int n : set){
            int run = 1;
            if(set.contains(n-1)){
                continue;
            }
            while(set.contains(n+1)){
                run++;
                n++;
            }


            res = Math.max(res,run);
        }

        return res;
    }
}
