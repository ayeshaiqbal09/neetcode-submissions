class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set=new HashSet<>(wordDict);
        boolean dp[]=new boolean[s.length()+1];
        dp[0]=true;
        for(int i=1;i<=s.length();i++)
        {
            for(int j=0;j<i;j++)
            {
                if(dp[j] && set.contains(s.substring(j, i)))
                {
                    dp[i]=true;
                    break;
                }
            }

        }
        return dp[s.length()];

    }
    public boolean dfs(String s, int i, HashSet<String> set, int t, Boolean dp[])
    {
        if(i==s.length())return true;
        if(dp[i]!=null)return dp[i];

        for(int j=i;j<(Math.min(i+t, s.length()));j++)
        {
            if(set.contains(s.substring(i, j+1)))
            {
                if(dfs(s, j+1, set, t, dp))
                return dp[i]=true;
            }
        }
        return dp[i]=false;
    }
}
