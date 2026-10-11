class Solution {
    private List<String> ans = new ArrayList<>();
    private String[] comb = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0)
            return ans;
        dfs(0, "", digits);
        return ans;
    }
    public void dfs(int i, String curr, String digit) {
        if (curr.length() == digit.length()) {
            ans.add(curr);
            return;
        }
        String arr = comb[digit.charAt(i) - '0'];
        for (char c : arr.toCharArray()) {
            dfs(i + 1, curr + c, digit);
        }
    }
}
