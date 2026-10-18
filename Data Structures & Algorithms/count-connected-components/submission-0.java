class Solution {
    public int countComponents(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());

        }
        for(int it[]: edges)
        {
            adj.get(it[0]).add(it[1]);
            adj.get(it[1]).add(it[0]);

        }
        boolean vis[]=new boolean[n];
        int res=0;
        for(int i=0;i<n;i++)
        {
            if(!vis[i])
            {
                dfs(adj, i, vis);
                res++;
            }
        }
        return res;
    }
    public void dfs(ArrayList<ArrayList<Integer>> adj, int i, boolean vis[])
    {
        vis[i]=true;
        for(int it: adj.get(i))
        {
            if(!vis[it])
            dfs(adj, it, vis);
        }
    }
}
