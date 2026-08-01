class Solution {
    public String encode(List<String> strs) {
        if (strs.isEmpty())
            return "";
        StringBuilder res = new StringBuilder();
        List<Integer> sizes = new ArrayList<>();
        for (String s : strs) {
            sizes.add(s.length());
        }
        for (int len : sizes) {
            res.append(len).append(',');
        }
        res.append('#');
        for (String s : strs) {
            res.append(s);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        if (str.length() == 0)
            return new ArrayList<>();
        List<String> ans = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        int i = 0;
        while (str.charAt(i) != '#') {
            StringBuilder cur = new StringBuilder();
            while (str.charAt(i) != ',') {
                cur.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(cur.toString()));
            i++;
        }
        i++;
        for (int sz : sizes) {
            ans.add(str.substring(i, i + sz));
            i += sz;
        }
        return ans;
    }
}
