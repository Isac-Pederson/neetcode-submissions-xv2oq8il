class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l = 0;
        int longest = 0;
        int count = 0;

        for(int r = 0; r < s.length(); r++){
            while(set.contains(s.charAt(r))){
               System.out.println("REMOVED: " + s.charAt(l) + " L: " + l);
               set.remove(s.charAt(l)); 
               l++; 
               count = r-l; 
            }
            count++; 
            set.add(s.charAt(r));
            System.out.println("ADDED: " + s.charAt(r));
            longest = Math.max(longest, count);
        }
        return longest; 

        
    }
}
