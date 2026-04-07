class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       List<List<String>> result = new ArrayList<>();
       Map<String, List<String>> seenWords = new HashMap<>();

       for(int i = 0; i < strs.length; i++){
        char[] wordArr = strs[i].toCharArray();

        Arrays.sort(wordArr);
        String word = new String(wordArr);
        if(!seenWords.containsKey(word)){
            seenWords.put(word,new ArrayList<>());
        }
        seenWords.get(word).add(strs[i]);
       }
       return new ArrayList<>(seenWords.values());

    }
}
