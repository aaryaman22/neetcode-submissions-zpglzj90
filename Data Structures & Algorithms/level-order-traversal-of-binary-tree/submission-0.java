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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        List<List<Integer>> ans = new ArrayList<>();
        if(Objects.isNull(root))return ans;
        while(!q.isEmpty()){
            int len = q.size();
            List<Integer> lev = new ArrayList<>();
            while(len-- > 0){
                TreeNode t = q.poll();
                if(Objects.nonNull(t.left))
                {
                    q.offer(t.left);
                }
                if(Objects.nonNull(t.right))
                {
                    q.offer(t.right);
                }
                lev.add(t.val);
            }
            ans.add(lev);
        }
        return ans;
    }
}
