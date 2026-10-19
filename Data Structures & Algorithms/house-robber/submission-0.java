class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp, -1);
        return dfs(0, n, nums, dp);
    }
    public int dfs(int i, int n, int nums[], int dp[])
    {
        if(i>=n)
        {
            return 0;
        }
        if(dp[i]!=-1)return dp[i];
        int take=nums[i]+dfs(i+2, n, nums, dp);
        int not= dfs(i+1, n, nums, dp);
        return dp[i]= Math.max(take, not);
    }
}
