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
    public int diameterOfBinaryTree(TreeNode root) {
        return dfs(root, 0);
        
    }

    private int dfs(TreeNode root, int count){
        if(root == null) return count;
        if(root.left != null && root.right != null && count != 0){
            System.out.println(root.left.val);
            System.out.println(root.right.val);
            count--;
        }
        int left = dfs(root.left, count+1);
        int right = dfs(root.right, count+1);
        return Math.max(left,right);
    }
}
