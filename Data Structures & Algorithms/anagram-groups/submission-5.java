class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res = HashMap<>();

        for(String word : strs){
           int[] count = [26];
           for(char c : word.toCharArray()){
            count[c - 'a']++;
           } 
           String strCount = count.toString();

           res.putIfAbsent(strCount ,new ArrayList<>());
           res.get(strCount).add(word);
        }

        return new ArrayList<>{res.values};
    }
}
