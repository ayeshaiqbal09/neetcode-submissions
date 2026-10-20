class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int total = 0;
        for (int it : nums) {
            total += it;
        }
        if (total - target < 0 || (total - target) % 2 != 0)
            return 0;

        int dp[][] = new int[n][(total - target) / 2 + 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return dfs(n - 1, nums, (total - target) / 2, dp);
    }
    public int dfs(int i, int nums[], int k, int dp[][]) {
        if (i == 0) {
            if (k == 0 && nums[i] == 0)
                return 2;
            else if (k == 0 || nums[i] == k)
                return 1;

            else
                return 0;
        }
        if (dp[i][k] != -1)
            return dp[i][k];
        int not = dfs(i - 1, nums, k, dp);
        int take = 0;
        if (k >= nums[i]) {
            take = dfs(i - 1, nums, k - nums[i], dp);
        }
        return dp[i][k] = take + not;
    }
}
