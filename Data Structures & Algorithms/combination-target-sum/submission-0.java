class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        dfs(nums, target, 0, list, arr);
        return list;
    }
    public void dfs(int nums[], int k, int i,  List<List<Integer>> list, List<Integer> arr)
    {
        if(k==0)
        {
            list.add(new ArrayList<>(arr));
            return;
        }
        if(k<0 || i>=nums.length)return;

        arr.add(nums[i]);
        dfs(nums, k-nums[i], i, list, arr);
        arr.remove(arr.size()-1);
        dfs(nums, k, i+1, list, arr);
    }
}
