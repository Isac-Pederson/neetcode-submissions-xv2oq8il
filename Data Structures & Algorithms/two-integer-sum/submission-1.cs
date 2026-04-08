public class Solution {
    public int[] TwoSum(int[] nums, int target) {

        HashSet<int> results = new HashSet<int>();

        for (int i=0; i<nums.Length;i++){
            for(int j=0; j<nums.Length;j++){
                if (nums[i] + nums[j] == target){
                    results.Add(i);
                    results.Add(j);
                    i = nums.Length;
                    j = nums.Length;
                }
            }

        }

        return results.ToArray();

    }
}
