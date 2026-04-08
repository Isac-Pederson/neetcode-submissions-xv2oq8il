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
    public boolean isBalanced(TreeNode root) {
        int[] pair = new int[2];
        dfs(root, pair);
        
        for(int num : pair){
            System.out.println(num);
        }

        return Math.abs(pair[0] - pair[1]) < 2;
        
    }

    public int[] dfs(TreeNode root, int[] pair){
        if(root == null) return pair; 
        if(root.left != null) pair[0]++;
        if(root.right != null) pair[1]++;
        dfs(root.left, pair);
        dfs(root.right, pair);

        return pair;

    }
}
