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
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        dfs(root, 0);
        return ans;
    }
    public void dfs(TreeNode root, int d)
    {
        if(root ==null)return;

        if(ans.size()==d)
        {
            ans.add(new ArrayList<>());
        }

        ans.get(d).add(root.val);
        dfs(root.left, d+1);
        dfs(root.right, d+1);
    }
}
