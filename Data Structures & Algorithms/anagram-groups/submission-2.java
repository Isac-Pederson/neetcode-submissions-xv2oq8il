class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> groups = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            if(strs.length == 1){
                    List<String> group = new ArrayList<>();
                     group.add(strs[0]);
                    result.add(group);
                    return result;
            }
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if(!groups.containsKey(sortedWord)){
                groups.put(sortedWord, new ArrayList<>());
            }
            groups.get(sortedWord).add(strs[i]);
        }

        return new ArrayList<>(groups.values());
    }
}
