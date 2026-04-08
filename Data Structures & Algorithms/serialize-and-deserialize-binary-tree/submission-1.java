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
    StringBuilder sb = new StringBuilder();
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        sb = new StringBuilder();
        serHelper(root);
        return sb.toString();
    }
    private void serHelper(TreeNode tn){
        if(tn == null){
            sb.append("N,");
            return;
        }
        sb.append(tn.val).append(",");
        serHelper(tn.right);
        serHelper(tn.left);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] ch = data.split(",");
        Queue<String> q = new LinkedList<>(Arrays.asList(ch));
        return build(q);
    }
    private TreeNode build(Queue<String> q){
        String val = q.poll();
        if(val.equals("N")){
            return null;
        }

        TreeNode tn = new TreeNode(Integer.parseInt(val));
        tn.right = build(q);
        tn.left = build(q);
        
        return tn;
    }
}
