class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res = new HashMap<>();

        for(String word : strs){
           int[] count = new int[26];
           for(char c : word.toCharArray()){
            count[c - 'a']++;
           } 
           String strCount = Arrays.toString(count);
           System.out.println(strCount);

           res.putIfAbsent(strCount ,new ArrayList<>());
           res.get(strCount).add(word);
        }

        return new ArrayList<>(res.values());
    }
}
