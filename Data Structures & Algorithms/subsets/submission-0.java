class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> set=new ArrayList<>();
        dfs(nums, 0, set, ans);
        return ans;
    }
    public void dfs(int nums[], int i, List<Integer> set, List<List<Integer>> list)
    {
        if(i>=nums.length)
        {
            list.add(new ArrayList<>(set));
            return;
        }
        set.add(nums[i]);
        dfs(nums, i+1, set, list);
        set.remove(set.size()-1);
        dfs(nums, i+1, set, list);
    }
}
