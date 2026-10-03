class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length())
            return "";
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        while (i < t.length()) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
            i++;
        }
        int req = map.size();
        int r = 0, l = 0, ind = -1, ind2 = -1, size = 0, res = Integer.MAX_VALUE;
        HashMap<Character, Integer> must = new HashMap<>();
        while (r < s.length()) {
            char ch = s.charAt(r);
            must.put(ch, must.getOrDefault(ch, 0) + 1);
            if (map.containsKey(ch) && map.get(ch).equals(must.get(ch)))
                size++;
            while (size == req) {
                if (r - l + 1 < res) {
                    res = r - l + 1;
                    ind = l;
                    ind2 = r;
                }
                char lh = s.charAt(l);
                must.put(lh, must.get(lh) - 1);
                if (map.containsKey(lh) && map.get(lh) > must.get(lh))
                    size--;
                l++;
            }
            r++;
        }
        return ind == -1 ? "" : s.substring(ind, ind2+1);
    }
}
