class Solution {
    public String longestPalindrome(String s) {
        int n = s.length(), ind = 0, res = 0;
        for (int i = 0; i < n; i++) {
            int l = i;
            int r = i;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > res) {
                    res = r - l + 1;
                    ind = l;
                }
                r++;
                l--;
            }

            l = i;
            r = i + 1;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > res) {
                    res = r - l + 1;
                    ind = l;
                }
                r++;
                l--;
            }
        }
        return s.substring(ind, res+ind);
    }
}
