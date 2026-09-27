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
        HashMap<Integer, Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        }

        return dfs(preorder, 0, inorder.length-1);
    }
    public TreeNode dfs(int pero[], int l, int r)
    {
        if(l>r)return null;

        int root=pero[pre++];
        TreeNode node=new TreeNode(root);
        int mid=map.get(root);
        node.left=dfs(pero, l, mid-1);
        node.right=dfs(pero, mid+1, r);
        return node;
    }
}
