class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int j=0, i=0,ind2=(n+m)/2, ind1=ind2-1, cnt=0, ind1ele=-1, ind2ele=-1;
        double res=0;
        while(i<n && j<m)
        {
            if(nums1[i]<nums2[j])
            {
                if(cnt==ind1)ind1ele=nums1[i];
                else if(cnt==ind2)ind2ele=nums1[i];
                cnt++;
                i++;
            }
            else
            {
               if(cnt==ind1)ind1ele=nums2[j];
                else if(cnt==ind2)ind2ele=nums2[j];
                cnt++;
                j++;
            }
        }
        while(i<n)
        {
            if(cnt==ind1)ind1ele=nums1[i];
            else  if(cnt==ind2)ind2ele=nums1[i];
                cnt++;
                i++;
        }
        while(j<m)
        {
            if(cnt==ind1)ind1ele=nums2[j];
            else    if(cnt==ind2)ind2ele=nums2[j];
                cnt++;
                j++;
        }
        
        if((n+m) %2 != 0)
        {
            return ind2ele;
        }
        else
        {
            res=(double)(ind1ele+ind2ele)/2;
        }
        return res;
    }
}
