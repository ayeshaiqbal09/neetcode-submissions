class Solution {
    public int characterReplacement(String s, int k) {
        int r=0,l=0, freq=0, res=0;
        HashMap<Character, Integer> map=new HashMap<>();
        while(r<s.length())
        {
            char ch=s.charAt(r);
            map.put(ch, map.getOrDefault(ch,0)+1);
            freq=Math.max(freq, map.get(ch));
            while((r-l+1)-freq>k)
            {
                char lh=s.charAt(l);
                map.put(lh, map.get(lh)-1);
                l++;
            }
            res=Math.max(res, (r-l+1));
            r++;
        }
        return res;
    }
}
