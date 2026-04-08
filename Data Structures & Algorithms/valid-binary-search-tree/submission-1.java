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
    boolean isVal = true;
    public boolean isValidBST(TreeNode root) {
        dfs(root, root.val);
        return isVal;
    }

    private TreeNode dfs(TreeNode root, int initVal){
        if(root == null) return null;

        TreeNode left = dfs(root.left, initVal);
        TreeNode right = dfs(root.right, initVal);

        if(left != null && left.val >= initVal){
            isVal = false;
        }

        if(right != null && right.val <= initVal){
            isVal = false;
        }

        return root;

    }
}
