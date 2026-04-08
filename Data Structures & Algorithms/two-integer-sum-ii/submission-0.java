class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i-1] + numbers[i] == target){
                return new int[] {numbers[i-1], numbers[i]};
            }
        }

        return new int[]{};
        
    }
}
