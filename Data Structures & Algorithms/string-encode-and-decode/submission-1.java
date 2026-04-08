class Solution {

    public String encode(List<String> strs) {
        String encode = ""; 

        for(String w : strs){
            if(strs.size() < 2){
                encode += w;
            }else{
                encode += w + "-";
            }
        }

        // for(int i = 0; i < strs.size(); i++){
        //     if(strs.size() < 2){
        //         encode +=  strs[i];
        //     }else{
        //         encode += strs[i] + "-";
        //     }
        // }

        return encode;
    }

    public List<String> decode(String str) {
        String[] wordDecoded = str.split("-");
        return Arrays.asList(wordDecoded);
    }
}
