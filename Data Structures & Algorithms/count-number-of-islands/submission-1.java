class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int res = 0;
        int vis[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (vis[i][j] == 0 && grid[i][j] == '1') {
                    bfs(i, j, grid, n, m, vis);
                    res++;
                }
            }
        }
        return res;
    }
    public void bfs(int i, int j, char grid[][], int n, int m, int vis[][]) {
        vis[i][j] = 1;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i, j));
        int row[] = {1, 0, -1, 0};
        int col[] = {0, -1, 0, 1};
        while (!q.isEmpty()) {
            Pair p = q.poll();
            for (int k = 0; k < 4; k++)
            {
                int r = p.first + row[k];
                int c = p.second + col[k];
                if (r >= 0 && c >= 0 && r < n && c < m && vis[r][c] == 0 && grid[r][c] == '1') {
                    vis[r][c] = 1;
                    q.add(new Pair(r, c));
                }
            }
        }
    }
}
class Pair {
    int first, second;
    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
