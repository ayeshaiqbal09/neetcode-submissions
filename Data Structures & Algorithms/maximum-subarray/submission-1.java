class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int dp[][] = new int[n + 1][2];
        dp[n - 1][0] = dp[n - 1][1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            dp[i][1] = Math.max(nums[i], nums[i] + dp[i + 1][1]);
            dp[i][0] = Math.max(dp[i + 1][0], dp[i][1]);
        }
        return dp[0][0];
    }
    public int dfs(int nums[], int i, int dp[][], int f) {
        if (i == nums.length)
            return (f == 1) ? 0 : Integer.MIN_VALUE;
        if (dp[i][f] != -1)
            return dp[i][f];

        dp[i][f] = (f == 1)
            ? Math.max(0, nums[i] + dfs(nums, i + 1, dp, 1))
            : (Math.max(dfs(nums, i + 1, dp, 0), nums[i] + dfs(nums, i + 1, dp, 1)));
        return dp[i][f];
    }
}
