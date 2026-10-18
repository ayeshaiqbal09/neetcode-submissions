class Solution {
    public boolean validTree(int n, int[][] edges) {
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
        HashSet<Integer> vis=new HashSet<>();
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{0, -1});
        vis.add(0);
        while(!q.isEmpty())
        {
            int pair[]=q.poll();
            int node=pair[0];
            int prev=pair[1];
            for(int it: adj.get(node))
            {
                if(it==prev)continue;

                if(!vis.add(it))return false;
                q.add(new int[]{it, node});
            }
        }
        if(vis.size()==n)return true;
        return false;
        
    }
}
