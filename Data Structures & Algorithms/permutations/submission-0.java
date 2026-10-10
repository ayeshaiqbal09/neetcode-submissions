class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        dfs(nums, new boolean[nums.length], ans, sub);
        return ans;
    }
    public void dfs(int nums[], boolean pick[], List<List<Integer>> ans, List<Integer> sub) {
        if (sub.size() == nums.length) {
            ans.add(new ArrayList<>(sub));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!pick[i]) {
                sub.add(nums[i]);
                pick[i] = true;
                dfs(nums, pick, ans, sub);
                sub.remove(sub.size() - 1);
                pick[i] = false;
            }
        }
    }
}
