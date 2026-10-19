class Solution {
    public int climbStairs(int n) {
        int prev=1, prev2=1, ans=0;
        for(int i=2;i<=n;i++)
        {
            ans=prev+prev2;
            prev=prev2;
            prev2=ans;
        }
        return prev2;
    }
}