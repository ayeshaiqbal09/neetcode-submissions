class Solution {
    public int findDuplicate(int[] nums) {
        
        for(int it:nums)
        {
            int idx=Math.abs(it)-1;
            if(nums[idx]<0)return Math.abs(it);
            nums[idx]*=-1;
        }
        return -1;
    }
}
