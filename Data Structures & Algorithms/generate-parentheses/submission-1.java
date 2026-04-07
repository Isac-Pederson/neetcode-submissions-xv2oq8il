class Solution {

    void backtrack(int nOpen, int nClose, int n,List<String> res,StringBuilder stack){
        if(nOpen == n && nOpen == nClose){
            res.add(stack.toString());
            return;
        }

        if(nOpen < n){
            stack.append('(');
            backtrack(nOpen+1,nClose,n,res,stack);
            stack.deleteCharAt(stack.length()-1);    
        }
        if (nClose < nOpen){
            stack.append(')');
            backtrack(nOpen,nClose+1,n,res,stack);
            stack.deleteCharAt(stack.length()-1);

        }
        
    }


    public List<String> generateParenthesis(int n) {
        StringBuilder stack = new StringBuilder();
        List<String> res =  new ArrayList<>();

        backtrack(0,0,n,res,stack);
        return res;
                


        
    }
}
