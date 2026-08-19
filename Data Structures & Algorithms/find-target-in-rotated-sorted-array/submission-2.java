class Solution {
    public int search(int[] nums, int target) {
        
        int l=0, r=nums.length-1;
        if(r==0 && nums[0]==target)return r;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(nums[mid]==target)return mid;
            else if(nums[mid]>=nums[l])
            {
               if (target > nums[mid] || target < nums[l]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
            else
            {
                if(target<nums[mid] || target >nums[r])
                r=mid-1;
                else
                l=mid+1;
            }
        }
        return -1;
    }
}
