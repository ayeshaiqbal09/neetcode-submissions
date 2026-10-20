class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int it:nums)
        {
            sum+=it;
        }
        if(sum%2!=0)return false;
        int k=sum/2;
        Boolean dp[][]=new Boolean[n][k+1];
        return dfs(n-1,  k, nums, dp);
    }
    public boolean dfs(int i,  int k, int nums[], Boolean dp[][])
    {
        if(k==0)return true;
        if(i==0)
        {
            if(k==nums[i])return true;
            else
            return false;
        }
        if(dp[i][k]!=null)return dp[i][k];
        boolean not=dfs(i-1, k, nums, dp);
        boolean take=false;
        if(k>=nums[i])
        {
            take=dfs(i-1, k-nums[i], nums, dp);
        }
        return dp[i][k]=not || take;

    }
}
