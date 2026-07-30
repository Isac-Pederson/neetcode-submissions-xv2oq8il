class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] isSeen = new int[26];

        for(Character c : s.toCharArray()){
            int num = c - 'a';
            isSeen[num]++;
        }


        for(Character c : t.toCharArray()){
            int num = c - 'a';
            isSeen[num]--;
        }

        for(int n : isSeen){
            if(n != 0){
                return false;
            }
        }


        return true;

    }
}
