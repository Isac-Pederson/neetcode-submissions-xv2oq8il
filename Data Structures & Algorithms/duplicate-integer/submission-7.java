class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> isSeen = new HashSet<>();
        for(int i : nums){
            if(isSeen.contains(i)){
                return true;
            }
            isSeen.add(i);
        }
        return false;
    }
}