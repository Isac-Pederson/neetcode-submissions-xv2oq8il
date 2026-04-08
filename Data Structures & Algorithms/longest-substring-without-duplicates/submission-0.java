class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int longest = 0;
        int left = 0;
        int count = 0;

        for(int r = 0; r < s.length(); r++){

            while(set.contains(s.charAt(r))){
                count = 0;
                set.clear();
            }

            count++;
            longest = Math.max(longest, count);
            set.add(s.charAt(r));
            
        }
        return longest; 

        
    }
}
