class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if (n == 1) return nums[0];
        int dp[]=new int[n];
        
            Arrays.fill(dp, -1);
        
        
        int[] dp2 = new int[n];
        Arrays.fill(dp2, -1);
        return Math.max(dfs(0, n-1, nums, dp), dfs(1, n, nums, dp2));
    }
    public int dfs(int i, int n, int nums[], int dp[])
    {
        if(i>=n)return 0;
        if(dp[i]!=-1)return dp[i];
        dp[i]=Math.max(nums[i]+dfs(i+2, n, nums, dp), dfs(i+1, n, nums, dp));
        return dp[i];
    }
}
