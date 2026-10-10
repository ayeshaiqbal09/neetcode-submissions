class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> sub=new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, 0, target, list, sub);
        return list;
    }
    public void dfs(int nums[], int i, int k, List<List<Integer>> list, List<Integer> sub)
    {
        if(k==0)
        {
            list.add(new ArrayList<>(sub));
            return;
        }
        if(k<=0 || i>=nums.length)return;

        sub.add(nums[i]);
        dfs(nums, i+1, k-nums[i], list, sub);
        while(i+1<nums.length && nums[i]==nums[i+1])i++;
        sub.remove(sub.size()-1);
        dfs(nums, i+1, k, list, sub);
    }
}
