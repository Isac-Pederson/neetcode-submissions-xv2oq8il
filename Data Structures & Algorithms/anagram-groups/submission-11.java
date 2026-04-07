class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            int[] key = new int[26];
            for(char c : strs[i].toCharArray()){
                key[c-'a']++;
            }
            map.computeIfAbsent(Arrays.toString(key), k -> new ArrayList<>()).add(strs[i]);
        }
        System.out.println(map);

        List<List<String>> values = new ArrayList<>(map.values());
        return values;
    }
}
