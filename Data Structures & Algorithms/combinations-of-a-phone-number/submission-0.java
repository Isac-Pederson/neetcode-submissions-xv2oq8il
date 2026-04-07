class Solution {
    List<String> res = new ArrayList<>();
    String[] digToChar = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return res;
        bt(digits,"",0);
        return res;
    }

    void bt(String digits,String currString, int i){
        if(digits.length() == currString.length()){
            res.add(currString);
            return;
        }

        String chars = digToChar[digits.charAt(i) - '0'];
        for(char c : chars.toCharArray()){
            bt(digits, currString + c, i+1);
        }
    }
}
