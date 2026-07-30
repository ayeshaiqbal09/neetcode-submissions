class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int a=0,b=0;
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(target-nums[i]))
            {
                a=map.get(target-nums[i]);
                b=i;
                return new int[]{a,b};
            }
            map.put(nums[i],i);
        }
        return new int[]{a,b};
    }
}