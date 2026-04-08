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
        int count = 0;
        int maxVal = 0;
    public int goodNodes(TreeNode root) {
        maxVal = root.val;
        dfs(root, maxVal);
        return count;

        
    }

    private TreeNode dfs(TreeNode root, int maxVal){
        if(root == null) return null;
        
        TreeNode left = dfs(root.left, maxVal);
        TreeNode right = dfs(root.right, maxVal);


        if(root.val >= maxVal){
            System.out.println(root.val);
            if(left != null && right != null){
                maxVal = root.val;
            }
            count++;
        }

        return root;
    }
}
