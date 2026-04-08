public class Solution {
    public int[] TwoSum(int[] nums, int target) {

        int[] results;

        for (int i=0; i<nums.Length;i++){
            for(int j=0; j<nums.Length;j++){
                if nums[i] + nums[j] == target{
                    results.Add(nums[i]);
                    results.Add(nums[j]);
                }
            }
        }

        return results;

    }
}
