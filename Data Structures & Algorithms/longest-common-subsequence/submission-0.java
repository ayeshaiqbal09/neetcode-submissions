class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return dfs(n-1, m-1, text1, text2, dp);
    }
    public int dfs(int i, int j, String s, String w, int dp[][])
    {
        if(i<0 || j<0)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s.charAt(i)==w.charAt(j))
        {
            dp[i][j]=1+dfs(i-1, j-1, s, w, dp);
        }
        else
        {
            dp[i][j]=Math.max(dfs(i-1, j, s, w, dp), dfs(i, j-1, s, w, dp));
        }
        return dp[i][j];
    }
}
