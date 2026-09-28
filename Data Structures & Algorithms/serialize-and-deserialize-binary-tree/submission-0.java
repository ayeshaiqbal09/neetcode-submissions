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

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<String> res=new ArrayList<>();
        dfsSerial(root, res);
        return String.join(",", res);
    }

    public void dfsSerial(TreeNode root, List<String> res)
    {
        if(root==null)
        {
            res.add("N");
            return;
        }
        res.add(String.valueOf(root.val));
        dfsSerial(root.left, res);
        dfsSerial(root.right, res);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String val[]=data.split(",");
        int ind[]={0};
       return dfsDeserial(val, ind);
         
    }

    public TreeNode dfsDeserial(String val[], int ind[])
    {
        if(val[ind[0]].equals("N"))
        {
            ind[0]++;
            return null;
        }
        TreeNode node=new TreeNode(Integer.parseInt(val[ind[0]]));
        ind[0]++;
        node.left= dfsDeserial(val, ind);
        node.right=dfsDeserial(val, ind);
        return node;
    }
}
