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
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> st = new Stack<>();
        TreeNode node = root;

        while(true){

            while(Objects.nonNull(node)){
                st.add(node);
                node = node.left;
            }

            TreeNode curNode = st.pop();
            k--;
            if(k==0)return curNode.val;
            node = curNode.right;
        }   
        

    }
}
