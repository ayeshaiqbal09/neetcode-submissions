class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return dfs(0, n, -1, dp, nums);
    }
    public int dfs(int i, int n,int prev, int dp[][], int nums[])
    {
        if(i==n)return 0;
        if(dp[i][prev+1]!=-1)return dp[i][prev+1];
        int take=dfs(i+1, n, prev, dp, nums);
        if(prev==-1 || nums[prev]<nums[i])
        {
            take=Math.max(take, 1+ dfs(i+1, n, i, dp, nums));
        }
        return dp[i][prev+1]=take;
    }
}
