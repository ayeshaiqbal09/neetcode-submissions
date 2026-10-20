class Solution {
    public int maxProfit(int[] prices) {
      int n=prices.length;
      int dp[][]=new int[n][2];
      for(int i=0;i<n;i++)
      {
        Arrays.fill(dp[i], -1);
      }  
      return dfs(0, 1, prices, dp)==-1?0:dfs(0, 1, prices, dp);
    }
    public int dfs(int i, int buy, int prices[], int dp[][])
    {
        if(i>=prices.length||buy<0)return 0;

        if(dp[i][buy]!=-1)
        return dp[i][buy];

        if(buy==1)
        {
            dp[i][buy]=Math.max(dfs(i+1, 0, prices, dp)-prices[i], dfs(i+1, 1, prices, dp));
        }
        else
        {
            dp[i][buy]=Math.max(dfs(i+2, 1, prices, dp)+prices[i], dfs(i+1, 0, prices, dp));
        }
        return dp[i][buy];
    }
}
