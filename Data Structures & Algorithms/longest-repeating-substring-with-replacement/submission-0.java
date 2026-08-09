class Solution {
    public int characterReplacement(String s, int k) {
        int maxlen = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        for (char ch : set) {
            int t = 0, l = 0;
            for (int r = 0; r < s.length(); r++) {
                if (s.charAt(r) == ch)
                    t++;
                while ((r - l + 1) - t > k) {
                    if (s.charAt(l) == ch)
                        t--;

                    l++;
                }
                maxlen = Math.max(maxlen, r - l + 1);
            }
        }
        return maxlen;
    }
}
