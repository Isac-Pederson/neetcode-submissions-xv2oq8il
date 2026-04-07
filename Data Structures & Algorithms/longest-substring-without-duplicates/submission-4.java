class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int longestSub = 0;
        int count = 0;
        HashSet<Character> seenLetters = new HashSet<>(); 

        for(int r = 0; r < s.length(); r++){
            while(seenLetters.contains(s.charAt(r))){
                seenLetters.remove(s.charAt(l));
                l++;
            }
            seenLetters.add(s.charAt(r));

            for(Character c : seenLetters){
                System.out.println(c);
            }

            longestSub = Math.max(longestSub, r-l+1);

        }

        return longestSub;


        }
        
}
