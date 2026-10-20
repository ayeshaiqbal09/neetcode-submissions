class Solution {
    int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    public int longestIncreasingPath(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        int res=0;
        for(int i=0; i<n; i++)
        {
            for(int j=0;j<m;j++)
            {
                res=Math.max(res, dfs(matrix, n, m, i, j, Integer.MIN_VALUE, dp));
            }
        }
        return res;
    }
    public int dfs(int mat[][], int n, int m, int r, int c, int prev, int dp[][])
    {
        if(r<0 ||r>=n || c<0 || c>=m || mat[r][c]<=prev)return 0;
        if(dp[r][c]!=-1)return dp[r][c];
        int ans=1;
        for(int d[]: directions)
        {
            ans= Math.max(ans, 1+ dfs(mat, n, m, r+d[0], c+d[1], mat[r][c], dp));
        }
        return dp[r][c]=ans;
    }
}
