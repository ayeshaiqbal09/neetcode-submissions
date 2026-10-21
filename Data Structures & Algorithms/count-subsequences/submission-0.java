class Solution {
    public int numDistinct(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(m>n)return 0;
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dp[i], -1);
        }
        return dfs(s, t, n, m, 0, 0, dp);
    }
    public int dfs(String s, String t, int n, int m, int i, int j, int dp[][])
    {
        if(j==m)return 1;
        if(i==n)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        dp[i][j]=dfs(s, t, n, m, i+1, j, dp);
        if(s.charAt(i)==t.charAt(j))
        {
            dp[i][j]+=dfs(s,t, n, m, i+1, j+1, dp);
        }
        return dp[i][j];
    }
}
