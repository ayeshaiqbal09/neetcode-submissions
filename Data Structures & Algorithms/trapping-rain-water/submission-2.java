class Solution {
    public int trap(int[] height) {
        int left=0, right=height.length-1, leftM=0, rightM=0, area=0;
        while(left<right)
        {
            if(height[left]<height[right])
            {
                if(leftM<height[left])
                {
                    leftM=height[left];
                }
                else
                area=area+leftM-height[left];
                left++;
            }
            else 
            {
                if(rightM<height[right])
                {
                    rightM=height[right];
                }
                else
                area=area+rightM-height[right];
                right--;
            }
        }
        return area;
    }
}
