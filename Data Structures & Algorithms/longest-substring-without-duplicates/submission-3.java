class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>(); 
        int longest = 0;
        int l = 0;

        for(int r = 0; r < s.length(); r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            longest = Math.max(longest, r-l+1);
            set.add(s.charAt(r));            

        }
        return longest;
    }
}
