class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> part=new ArrayList<>();
        List<String> ty=new ArrayList<>();
        dfs(0, s, part, ty);
        return part;
    }
    public void dfs(int i, String s, List<List<String>> part, List<String> ty)
    {
        if(i==s.length())
        {
            part.add(new ArrayList<>(ty));
            return;
        }
        for(int j=i;j<s.length();j++)
        {
            if(pali(s, i, j))
            {
                ty.add(s.substring(i, j+1));
                dfs(j+1, s, part, ty);
                ty.remove(ty.size()-1);
            }
        }
    }
    private boolean pali(String s, int l, int r)
    {
        while(l<r)
        {
            if(s.charAt(l) !=s.charAt(r))return false;
            l++;
            r--;

        }
        return true;
    }
}
