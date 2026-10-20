class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int dp[][]=new int[n][amount+1];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dp[i],-1);

        }
        int res= dfs(n-1,amount, coins, dp);
        return res>=(int)1e9?-1:res;
    }
    public int dfs(int i, int k, int coins[], int dp[][])
    {
        if(i==0)
        {
            return (k%coins[i]==0)?k/coins[i]:(int)1e9;
        }
        if(dp[i][k]!=-1)return dp[i][k];
        int not=dfs(i-1, k, coins, dp);
        int take=(int)1e9;
        if(coins[i]<=k)
        {
            take=1+dfs(i,k-coins[i], coins, dp);
        }
        return dp[i][k]=Math.min(take, not);
    }
}
