class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int dp[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return dfs(word1, word2, n - 1, m - 1, dp);
    }
    public int dfs(String s, String t, int i, int j, int dp[][]) {
        if (i < 0)
            return j + 1;
        if (j < 0)
            return i + 1;
        if (dp[i][j] != -1)
            return dp[i][j];
        if (s.charAt(i) == t.charAt(j)) {
            return dp[i][j] = dfs(s, t, i - 1, j - 1, dp);
        }
        int insert = 1 + dfs(s, t, i, j - 1, dp);
        int delete = 1 + dfs(s, t, i - 1, j, dp);
        int rep = 1 + dfs(s, t, i - 1, j - 1, dp);
        return dp[i][j] = Math.min(rep, Math.min(insert, delete));
    }
}
