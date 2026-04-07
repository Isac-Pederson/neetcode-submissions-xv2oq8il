class Solution {

    void backtrack(int openN, int closedN,List<String> res, StringBuilder stack, int n){
        if(openN == n && openN == closedN){
            res.add(stack.toString());
            return;
        }
        if(openN < n){
            stack.append('(');
            backtrack(openN+1,closedN,res,stack,n);
            stack.deleteCharAt(stack.length()-1);
        }
        if(openN > closedN){
            stack.append(')');
            backtrack(openN,closedN+1,res,stack,n);
            stack.deleteCharAt(stack.length()-1);

        }
    }


    public List<String> generateParenthesis(int n) {
        StringBuilder stack =  new StringBuilder();
        List<String> res = new ArrayList<>();
        backtrack(0,0,res,stack,n);
        return res;
    }
}
