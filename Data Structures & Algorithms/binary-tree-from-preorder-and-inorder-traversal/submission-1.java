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
    int pre=0;
       int in=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        return dfs(preorder, inorder, Integer.MAX_VALUE);
    }
    public TreeNode dfs(int pero[], int ino[], int r)
    {
        if(pre>=pero.length)return null;
        if(ino[in]==r)
        {
            in++;
            return null;
        }
        int root=pero[pre++];
        TreeNode node=new TreeNode(root);
        node.left=dfs(pero, ino, node.val);
        node.right=dfs(pero, ino, r);
        return node;
    }
}
