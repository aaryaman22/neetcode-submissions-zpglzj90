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
    int preIndex = 0;
    Map<Integer, Integer> mp = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inord) {
        int n = inord.length;
        for(int i = 0 ; i < n ; i++){
            mp.put(inord[i], i);
        }
        return cT(preorder, 0, inord.length -1);
    }

    private TreeNode cT(int[] pre, int low, int high){
        if(low > high) return null;

        int rootVal = pre[preIndex++];
        TreeNode tn = new TreeNode(rootVal);

        int index = mp.get(rootVal);

        tn.left = cT(pre, low, index-1);
        tn.right = cT(pre, index+1, high);
        return tn;
    } 
}
