class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int j=0, i=0, k=0;
        double res=0;
        int nums[]=new int[n+m];
        while(i<n && j<m)
        {
            if(nums1[i]<nums2[j])
            {
                nums[k++]=nums1[i++];
            }
            else
            {
                nums[k++]=nums2[j++];
            }
        }
        while(i<n)
        {
            nums[k++]=nums1[i++];
        }
        while(j<m)
        {
            nums[k++]=nums2[j++];
        }
        for(int it:nums)
        {
            System.out.println(it);
        }
        if((n+m) %2 != 0)
        {
            return nums[(n+m)/2];
        }
        else
        {
            int a=(n+m)/2;
            int b=a-1;
            res=(double)(nums[a]+nums[b])/2;
        }
        return res;
    }
}
