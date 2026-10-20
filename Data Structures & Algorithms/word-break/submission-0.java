class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set=new HashSet<>(wordDict);
        Boolean dp[]=new Boolean[s.length()];
        int t=0;
        for(String i:wordDict)
        {
            t=Math.max(i.length(),t);

        }
        return dfs(s, 0, set, t, dp);

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
