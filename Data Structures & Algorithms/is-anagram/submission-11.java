class Solution {
    public boolean isAnagram(String s, String t) {
        int[] isSeen = new int[26];

        for(char c : s.toCharArray()){
            isSeen[c - 'a']++;
        }
        for(char c : t.toCharArray()){
            isSeen[c - 'a']++;
        }

        for(int i = 0; i<isSeen.length; i++){
            if(isSeen[i] != 0 && isSeen[i]  % 2 != 0){
                return false;
            }
        }

        return true;
    }
}
