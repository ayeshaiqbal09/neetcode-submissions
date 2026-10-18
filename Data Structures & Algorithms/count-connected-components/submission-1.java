class Solution {
    public int countComponents(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int it[] : edges) {
            adj.get(it[0]).add(it[1]);
            adj.get(it[1]).add(it[0]);
        }
        boolean vis[] = new boolean[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                bfs(adj, i, vis);
                res++;
            }
        }
        return res;
    }
    public void dfs(ArrayList<ArrayList<Integer>> adj, int i, boolean vis[]) {
        vis[i] = true;
        for (int it : adj.get(i)) {
            if (!vis[it])
                dfs(adj, it, vis);
        }
    }
    public void bfs(ArrayList<ArrayList<Integer>> adj, int i, boolean vis[]) {
        Queue<Integer> q = new LinkedList<>();
        vis[i] = true;
        q.add(i);
        while (!q.isEmpty()) {
            int it = q.poll();
            for (int nd : adj.get(it)) {
                if (!vis[nd]) {
                    vis[nd] = true;
                    q.add(nd);
                }
            }
        }
    }
}
