class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int prefix=1, suffix=1;
        int res=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(prefix==0)prefix=1;

            prefix*=nums[i];
            res=(prefix>res)?prefix:res;
        }
        for(int i=n-1;i>=0;i--)
        {
            suffix=(suffix==0)?1:suffix;
            suffix*=nums[i];
            res=(suffix>res)?suffix:res;
        }
        return res==Integer.MIN_VALUE?0:res;
    }
}
