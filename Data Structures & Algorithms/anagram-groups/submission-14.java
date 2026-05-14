class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            int[] arr = new int[26];
            String s = strs[i];

            for(char c : s.toCharArray()){
                int r = c - 'a';
                arr[r]++;
            }
            String key = Arrays.toString(arr);
            map.computeIfAbsent(key, k -> new ArrayList()).add(s);
        }

        return map.values().stream().collect(Collectors.toList());


    }
}
