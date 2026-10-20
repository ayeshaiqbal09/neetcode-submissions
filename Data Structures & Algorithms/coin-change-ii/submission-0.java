class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int dp[][]=new int[n][amount+1];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return dfs(n-1, coins, amount, dp);
    }
    public int dfs(int i, int coins[], int k, int dp[][])
    {
        if(k==0)return 1;
        if(i==0)
        {
            if(k%coins[i]==0)return 1;
            else
            return 0;
        }
        if(dp[i][k]!=-1)return dp[i][k];
        int not= dfs(i-1, coins, k, dp);
        int take=0;
        if(k>=coins[i])
        {
            take=dfs(i, coins, k-coins[i], dp);
        }
        return dp[i][k]=take+not;
    }
}
