class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        return Math.min(dfs(0, cost.length, cost, dp), dfs(1, cost.length, cost, dp));
    }
    public int dfs(int i, int n, int cost[], int dp[]) {
        if (i >= n)
            return 0;
        if (dp[i] != -1)
            return dp[i];
        int take = dfs(i + 1, n, cost, dp);
        int take2 = dfs(i + 2, n, cost, dp);

        return dp[i] = cost[i] + Math.min(take, take2);
    }
}
