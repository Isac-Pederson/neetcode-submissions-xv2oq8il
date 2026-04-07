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
    public int maxDepth(TreeNode root) {
        return getDepth(root, 0);
        
    }

    private int getDepth(TreeNode root, int counter){
        if(root != null){
            counter++;
        
            int left = getDepth(root.left, counter);
            int right = getDepth(root.right, counter);
            return Math.max(left,right);
        }
        return counter;



    }
}
