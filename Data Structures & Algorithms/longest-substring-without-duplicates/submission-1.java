class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0, maxlen = 0, len = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (r < s.length()) {
            char ch = s.charAt(r);
            if (map.containsKey(ch) && map.get(ch)>=l) {
                l = map.get(ch) + 1;
            }

            len = r - l + 1;
            maxlen = Math.max(maxlen, len);
            map.put(ch, r);
            r++;
        }
        return maxlen;
    }
}
