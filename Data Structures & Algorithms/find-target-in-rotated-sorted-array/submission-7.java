class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        if(r==0 && nums[0]==target)return r;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (target == nums[mid])
                return mid;
            if (nums[mid] >= nums[l]) {
                if (target < nums[l] || target > nums[mid]) {
                    l=mid+1;

                }
                else
                r=mid-1;
            }
            else
            {
                if(target>nums[mid] && target<=nums[r])
                l=mid+1;
                else
                r=mid-1;
            }
        }
        return -1;
    }
}
