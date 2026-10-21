class Solution {
    public int maxCoins(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n+2];
        arr[n+1]=arr[0]=1;
        for(int i=0;i<n;i++)
        {
            arr[i+1]=nums[i];
        }
        int dp[][]=new int[n+2][n+2];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = -1;
            }
        }
        return dfs(arr, 1, arr.length-2, dp);
    }
    public int dfs(int arr[], int l, int r, int dp[][])
    {
        if(l>r)return 0;
        if(dp[l][r]!=-1)return dp[l][r];
         dp[l][r]=0;
        for(int i=l; i<=r;i++)
        {
            int coin=arr[l-1]* arr[i] * arr[r+1];
            coin+= dfs(arr, l, i-1, dp)+ dfs(arr, i+1, r, dp);
            dp[l][r]=Math.max(dp[l][r], coin);
        }
        return dp[l][r];
    }
}
