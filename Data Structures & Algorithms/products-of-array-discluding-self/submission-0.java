class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length]; 
        for(int i = 0; i < nums.length; i++){
            int p = -21;
            for(int j = 0; j < nums.length; j++){
                if(i != j){
                    if(p == -21){
                        p = nums[j];
                    }else{
                        p = p * nums[j];
                    }
                }
            }
            res[i] = p;
        }

        return res;
        
    }
}  
