class Solution {
    Stack<int[]> pos;
    public boolean exist(char[][] board, String word) {
        pos = new Stack<>();
        char[] wrd = word.toCharArray();
        return backtrack(board,wrd, 0);
    }

    public boolean backtrack(char[][]board, char[] word, int j){
        if(j >= word.length){
            return true;
        }

        for(int i = j; i < word.length; i++){
            System.out.println(j);
            char letter = word[j];
            for(int k = 0; k < board.length; k++){
                for(int l = 0; l < board[k].length; l++){
                    // System.out.println(l);
                    if(board[k][l] == letter){
                        if(pos.isEmpty()){
                            pos.add(new int[]{k,l});
                        }else{
                            int[] lastPos = pos.peek();
                            if((lastPos[0] - 1 == k ||
                             lastPos[0] + 1 == k) && lastPos[1] == l){
                                pos.add(new int[]{k,l});
                                backtrack(board, word, j+1);
                             }else if((lastPos[1] - 1 == l ||
                             lastPos[1] + 1 == l) && lastPos[0] == 0){
                                pos.add(new int[]{k,l});
                                backtrack(board, word, j+1);
                             }else{
                                break;
                             }
                        }
                    }
                }
            }


        }
        return false;

        

    }
}
