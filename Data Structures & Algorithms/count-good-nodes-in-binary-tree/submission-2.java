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
    private int count = 0;
    public int goodNodes(TreeNode root) {
        dfs(root, root.val);
        return count;
    }

    private TreeNode dfs(TreeNode root, int maxVal){
        if(root == null) return null;
        
        if(root.val >= maxVal){
            maxVal = root.val;
            System.out.println(root.val);
            count++;
        }

        TreeNode left = dfs(root.left, maxVal);
        TreeNode right = dfs(root.right, maxVal);



        return root;
    }
}
