class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0, r=0, len=0;
        HashMap<Character, Integer> map=new HashMap<>();
        while(r<s.length())
        {
            char ch=s.charAt(r);
            if(map.containsKey(ch) && map.get(ch)>=l)
            {
                l=map.get(ch)+1;
            }
            len=Math.max(len, r-l+1);
            map.put(ch, r);
            r++;
        }
        return len;
    }
}
