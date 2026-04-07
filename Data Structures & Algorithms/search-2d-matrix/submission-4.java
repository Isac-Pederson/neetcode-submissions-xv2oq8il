class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {


        for(int i = 0; i < matrix.length; i++){
            int l = 0;
            int r = matrix[i].length-1;
            while(l <= r){
                int m = (l+r)/2;
                if(matrix[i][m] < target){
                    l = m+1;
                }else if(matrix[i][m] > target){
                    r = m-1;
                }else{
                    return true;
                }
            }
        }
        return false;

    }
}
