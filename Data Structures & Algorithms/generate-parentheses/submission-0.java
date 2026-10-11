class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder st = new StringBuilder();
        dfs(0, 0, n, ans, st);
        return ans;
    }
    public void dfs(int open, int close, int n, List<String> ans, StringBuilder st) {
        if (open == n && open == close) {
            ans.add(st.toString());
            return;
        }
        if (open < n) {
            st.append('(');
            dfs(open + 1, close, n, ans, st);
            st.deleteCharAt(st.length() - 1);
        }
        if (close < open) {
            st.append(')');
            dfs(open, close + 1, n, ans, st);
            st.deleteCharAt(st.length() - 1);
        }
    }
}
