class Solution {

    public String encode(List<String> strs) {
        String encode = "";

        for(String w : strs){
            System.out.println(w);
            if(strs.size() == 1){
                encode += w;
            }else{
                encode += w + "-";
            }
        }
        return encode;
    }

    public List<String> decode(String str) {
        if(str == ""){
            return new ArrayList<String>();
        }
        String[] wordDecoded = str.split("-");
        return Arrays.asList(wordDecoded);
    }
}
