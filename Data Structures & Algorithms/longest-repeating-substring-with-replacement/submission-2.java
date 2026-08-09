class Solution {
    public int characterReplacement(String s, int k) {
        int count[] = new int[26];
        int r = 0, l = 0, freq = 0, ans = 0;
        while (r < s.length()) {
            char rh = s.charAt(r);
            count[rh - 'A']++;
            freq = Math.max(freq, count[rh - 'A']);
            while (r - l + 1 - freq > k) {
                char lh = s.charAt(l);
                count[lh - 'A']--;
                l++;
                
            }

            ans = Math.max(ans, r - l + 1);

            r++;
        }
        return ans;
    }
}