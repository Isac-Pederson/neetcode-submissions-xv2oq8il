class Solution {
    public boolean isAnagram(String s, String t) {
        int[] isSeen = new int[26];

        for(Character c : s.toCharArray()){
            int pos = c - 'a';
            isSeen[pos]++;
        }

        for(Character c : t.toCharArray()){
            int pos = c - 'a';
            isSeen[pos]--;
        }

        for(int i : isSeen){
            if(i > 0 || i < 0){
                return false;
            }
        }



        return true;

    }
}
