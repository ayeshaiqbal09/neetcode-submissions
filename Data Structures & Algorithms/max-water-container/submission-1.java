class Solution {
    public int maxArea(int[] heights) {
        int i = 0, j = heights.length - 1;
        int area = 0;
        while (i < j) {
            if (heights[i] <= heights[j]) {
                area = Math.max(area, heights[i] * (j - i));
                i++;
            } else {
                area = Math.max(area, heights[j] * (j - i));
                j--;
            }
        }
        return area;
    }
}
