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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        ArrayList<String> list = new ArrayList<>();
        dfs(root,list);
        return String.join(",",list);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] vals = data.split(",");
        int[] i = {0};
        return dfsDe(vals,i);
        
    }

    private TreeNode dfsDe(String[] data, int[] i){
        if(data[i[0]].equals("n")){
            i[0]++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(data[i[0]]));
        i[0]++;
        root.left = dfsDe(data,i);
        root.right = dfsDe(data,i);

        return root;

    }

    private void dfs(TreeNode root, ArrayList list){
        if(root == null){
            list.add("n");
            return;
        };
        
        list.add(Integer.toString(root.val));

        dfs(root.left, list);
        dfs(root.right, list);
    }
}
