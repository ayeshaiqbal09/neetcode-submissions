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
   
    public int maxPathSum(TreeNode root) {
        int res[]=new int[]{root.val};
        dfs(root, res);
        return res[0];
    }
    public int dfs(TreeNode node, int res[])
    {
        if(node==null)return 0;

        int left=Math.max(dfs(node.left, res), 0);
        int right=Math.max(dfs(node.right, res), 0);

        res[0]=Math.max(res[0], node.val + left+ right);
        return node.val+Math.max(left, right);
    }
    public int getMax(TreeNode root)
    {
        if(root==null)return 0;

        int left=getMax(root.left);
        int right=getMax(root.right);
        return Math.max(0, root.val+Math.max(left, right));
    }
}
