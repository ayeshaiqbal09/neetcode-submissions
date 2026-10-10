class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> sub=new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums, 0, list, sub);
        return list;
    }
    public void dfs(int nums[], int i, List<List<Integer>> list, List<Integer> sub)
    {
        if(i>=nums.length)
        {
            list.add(new ArrayList<>(sub));
            return;
        }
        

        sub.add(nums[i]);
        dfs(nums, i+1, list, sub);
        while(i+1<nums.length && nums[i]==nums[i+1])i++;
        sub.remove(sub.size()-1);
        dfs(nums, i+1, list, sub);
    }
}
