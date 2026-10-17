class Solution {
     int res=0;
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
       int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    ans=Math.max(ans, dfs(i, j, grid, n, m));
                }
                res=0;
            }
            
        }
        return ans;
    }
    public int dfs(int i, int j, int grid[][], int n, int m)
    {
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]==0)return 0;
        res++;
        grid[i][j]=0;
        dfs(i+1, j, grid, n, m);
        dfs(i-1, j, grid, n, m);
        dfs(i, j-1, grid, n, m);
        dfs(i, j+1, grid, n, m);

        return res;
    }
}
