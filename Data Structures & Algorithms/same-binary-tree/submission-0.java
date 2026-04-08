/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        int[] res = dfs(p,q);

        return (res[0] == 1 && res[1] == 1);
        
    }
    private int[] dfs(TreeNode n1, TreeNode n2){
        if(n1 == null && n2 == null){
            return new int[]{1,0};
        }else if((n1 == null && n2 != null) || n2 == null && n1 != null){
            return new int[]{0,1};
        }

        int[] left = dfs(n1.left, n2.left);
        int[] right = dfs(n1.right, n2.right);

        boolean isEq = n1.val == n2.val;
        boolean isBal = (left[0] == 1 && right[0] == 1 && isEq);

        return new int[]{isBal ? 1 : 0, isEq ? 1 : 0};
    }
}
