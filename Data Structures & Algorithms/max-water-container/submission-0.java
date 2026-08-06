class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int left=0, right=n-1;
        int area=0;
        while(left<right)
        {
            if(heights[left]<=heights[right])
            {
                area=Math.max(area, heights[left]*(right-left));
                left++;
            }
            else
            {
                area=Math.max(area, heights[right]*(right-left));
                right--;
            }
        }
        return area;
    }
}
