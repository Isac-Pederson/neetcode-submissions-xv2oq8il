class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        int r = n * m;
            while(l <= r){
                int mid = (l+r)/2;
                int mv = matrix[mid / m][mid % m];
                if(mv==target) return true;
                else if(mv < target){
                    l = mid+1;
                }else{
                    r = mid-1;
                }
            }
        return false;

    }
}
