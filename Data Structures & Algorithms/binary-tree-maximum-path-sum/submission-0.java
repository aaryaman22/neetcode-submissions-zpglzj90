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
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        mps(root);
        return maxSum;
    }
    private int mps(TreeNode node){
        if(node==null)return 0;
        int left = Math.max(mps(node.left), 0);
        int right = Math.max(mps(node.right), 0);

        int cp = node.val + right + left;
        maxSum = Math.max(maxSum, cp);
        return node.val + Math.max(left, right);
    }
}
