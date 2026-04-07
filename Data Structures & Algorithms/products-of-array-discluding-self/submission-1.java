class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            prefix[i] = 1;
            int index = 0;
            // System.out.println("LOOP INDEX: " + i);
            while(index < nums.length){
            // System.out.println("MADE IN WHILE");
                if(index == i){
                    index++;
                    if(index >= nums.length){
                        break;
                    }
                }
                prefix[i] *= nums[index];
                index++;
            }
            // System.out.println("PREFIX INDEX: " + prefix[i]);
        }

        return prefix;
    }
}  
