class Solution {

    public String encode(List<String> strs) {
        String encode = ""; 
        for(String word : strs){
            encode += word + "-";
        }

        return encode;
    }

    public List<String> decode(String str) {
        String[] wordDecoded = str.split("-");
        return Arrays.asList(wordDecoded);
    }
}
