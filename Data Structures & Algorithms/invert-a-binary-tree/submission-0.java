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
    public TreeNode invertTree(TreeNode root) {
        dFS(root);
        return root;
    }

    private void dFS(TreeNode root){
        if(root == null){
            return;
        }else{
            System.out.println(root.val);
            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;
        }
            dFS(root.left);
            dFS(root.right);
    }


}
