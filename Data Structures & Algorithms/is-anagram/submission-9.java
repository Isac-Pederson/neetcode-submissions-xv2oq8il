class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> res = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        //create map, char as key, int as value
        //if key doesnt exist in t return false
        // otherwise return true at end 
        for(int i = 0; i < s.length(); i++ ){
            res.put( s.charAt(i),res.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i = 0; i < t.length(); i++ ){
            if(res.get(t.charAt(i)) == null){
                return false;
            }
            if(res.get(t.charAt(i)) == 0){
                return false;
            }
            res.put( t.charAt(i),res.getOrDefault(t.charAt(i), 0) - 1);
        }
        return true;
    }
}
