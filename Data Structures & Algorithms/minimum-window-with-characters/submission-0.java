class Solution {
    public String minWindow(String s, String t) {
        if (s.length() <t.length())
            return "";
        int l = 0, r = 0;
        HashMap<Character, Integer> mapt = new HashMap<>();
        while (r < t.length()) {
            mapt.put(t.charAt(r), mapt.getOrDefault(t.charAt(r), 0) + 1);
            r++;
        }
        r = 0;
        HashMap<Character, Integer> win = new HashMap<>();
        int ind = -1, lastind = -1, res = Integer.MAX_VALUE, need = mapt.size(), have=0;
        while (r < s.length()) {
            char ch = s.charAt(r);
            win.put(ch, win.getOrDefault(ch, 0) + 1);
            if (mapt.containsKey(ch) && win.get(ch).equals(mapt.get(ch))) {
                have++;
            }
            while (have == need) {
                if ((r - l + 1) < res) {
                    res = r - l + 1;
                    ind = l;
                    lastind = r;
                }
                char lh = s.charAt(l);
                win.put(lh, win.get(lh) - 1);
                if (mapt.containsKey(lh) && win.get(lh) < mapt.get(lh))
                    have--;

                l++;
            }
            r++;
        }
        return ind == -1 ? "" : s.substring(ind, lastind+1);
    }
}
