class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char[]sorted = s.toCharArray();
            Arrays.sort(sorted);
            String key = String.valueOf(sorted);

            System.out.println(key);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        List<List<String>> mapVal = map.values().stream().collect(Collectors.toList());
        return mapVal;

    }
}
