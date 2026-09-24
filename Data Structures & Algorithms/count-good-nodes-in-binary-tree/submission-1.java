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
    public int goodNodes(TreeNode root) {
      Queue<Pair<TreeNode,Integer>> q=new LinkedList<>();
      q.add(new Pair<>(root, Integer.MIN_VALUE));
      int res=0;
      while(!q.isEmpty())
      {
            Pair<TreeNode, Integer> p=q.poll();
            TreeNode node=p.getKey();
            int max=p.getValue();
            if(node.val>=max)
            {
                res++;
            }
            if(node.left!=null)
            {
                q.add(new Pair<>(node.left, Math.max(node.val, max)));
            }
            if(node.right!=null)
            {
                q.add(new Pair<>(node.right, Math.max(node.val, max)));
            }

      }
      return res;
    }
    public int dfs(TreeNode root, int maxV)
    {
        if(root==null)return 0;

        int res=(root.val>=maxV)?1:0;
        maxV=Math.max(maxV, root.val);
        res+=dfs(root.left, maxV);
        res+=dfs(root.right, maxV);
        return res;
    }
}
