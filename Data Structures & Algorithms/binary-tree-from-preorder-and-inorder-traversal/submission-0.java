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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Character> map = setSide(preorder, inorder);
        TreeNode root = new TreeNode(preorder[0]);

        if(map.size() != 0){
            TreeNode curr = root;
            int seenRight = 0;
            for(int i = 1; i < preorder.length; i++){
                Character side = map.get(preorder[i]);
                if(side == 'l'){
                    curr.left = new TreeNode(preorder[i]);
                    curr = curr.left;
                }
                if(side == 'r'){
                    seenRight++;
                    if(seenRight == 1){
                        curr = root;
                    }
                    curr.right= new TreeNode(preorder[i]);
                    curr = curr.right;
                } 
            }
            
        }

        System.out.println(map.entrySet());

        return root;
        
    }


    private HashMap<Integer, Character> setSide(int[] preorder, int[] inorder){
        if(preorder == null || preorder.length == 0){
            return null;
        }

        HashMap<Integer,Character> map = new HashMap<>();

        int rootVal = preorder[0];
        boolean rightSide =  false;

        for(int num : inorder){
            if(num == rootVal){
                rightSide = true;
                continue;
            }
            if(rightSide){
                map.put(num, 'r');
            }else{
                map.put(num, 'l');
            }
        }
        return map;

    }
}
