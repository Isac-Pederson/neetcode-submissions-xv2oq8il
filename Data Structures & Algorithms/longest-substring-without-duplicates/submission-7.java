class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longestSub = 0;
        HashSet<Character> seenCharacters = new HashSet<>();
        int l = 0;

        for(int r = 0; r < s.length(); r++){
            while(seenCharacters.contains(s.charAt(r))){
                seenCharacters.remove(s.charAt(l));
                l++;
            }

            longestSub = Math.max(longestSub, r-l+1);
            seenCharacters.add(s.charAt(r));
        }


        return longestSub;
        



        }
        
}
