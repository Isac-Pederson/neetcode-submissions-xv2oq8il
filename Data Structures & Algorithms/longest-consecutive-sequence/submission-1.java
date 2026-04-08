class Solution {
    public int longestConsecutive(int[] nums) {
        int res = 0;
        int run = 1;
        Arrays.sort(nums);

        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return 1;
        }


        for(int i = 1; i < nums.length; i++ ){
            System.out.println(nums[i]);
           if(nums[i-1] +1 == nums[i]){
                run++;
           }else if(nums[i-1] == nums[i]){
            continue;
           }
           else{
            run = 0;
           } 

           if(run >= res)
            res = run;
        }

        return res;


        }
}
