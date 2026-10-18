class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=edges.length;i++)
        {
            adj.add(new ArrayList<>());
        }
        
        for(int it[]:edges)
        {
            adj.get(it[0]).add(it[1]);
            adj.get(it[1]).add(it[0]);
            boolean vis[]=new boolean[edges.length+1];
            if(dfs(it[0], vis, adj, -1))return it;
        }
        return new int[0];
    }
    public boolean dfs(int i, boolean vis[], ArrayList<ArrayList<Integer>> adj, int parent)
    {
        if(vis[i])return true;
        vis[i]=true;
        for(int it: adj.get(i))
        {
            if(parent==it)continue;
            if(dfs(it, vis, adj, i))return true;
        }
    return false;
    }
}
