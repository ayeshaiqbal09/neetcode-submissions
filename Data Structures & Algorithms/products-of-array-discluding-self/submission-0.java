class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[]=new int[nums.length];
        int pre=1, suff=1;
        //prefix
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=pre;
            pre*=nums[i];
        }
        //suffix
        for(int i=nums.length-1;i>=0;i--)
        {
            ans[i]*=suff;
            suff*=nums[i];
        }
        return ans;
    }
}  
