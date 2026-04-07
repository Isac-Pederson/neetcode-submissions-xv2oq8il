class Solution {
    HashSet<Pair<Integer, Integer>> path = new HashSet<>();
    private int ROWS, COLS;
    public boolean exist(char[][] board, String word) {
        ROWS =  board.length;
        COLS = board[0].length;

        for(int r = 0; r < ROWS; r++){
            for(int c = 0; c < COLS; c++){
                if(backtracking(board, r, c, 0, word)) return true;
            }
        }
        return false;
    }

    boolean backtracking(char[][] board,int rows, int cols, int i, String word){
        if(i == word.length()){
            return true;
        }


        if(rows < 0 || cols < 0 || rows >=  ROWS || cols >= COLS || board[rows][cols] != word.charAt(i) 
        || path.contains(new Pair<>(rows,cols))) {
            return false;
        }

        path.add(new Pair<>(rows, cols));
        boolean res = backtracking(board,rows + 1, cols, i+1, word) || 
                         backtracking(board,rows - 1, cols, i+1, word) || 
                         backtracking(board,rows, cols + 1, i+1, word) || 
                         backtracking(board,rows, cols - 1, i+1, word);
        path.remove(new Pair<>(rows, cols));
        return res;
    }
}
