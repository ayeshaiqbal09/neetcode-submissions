class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> st= new ArrayDeque<>();
        int ans=0;
        for(int i=0;i<=heights.length;i++)
        {
            while(!st.isEmpty() && (i==heights.length || heights[st.peek()]>=heights[i]))
            {
                int h= st.pop();
                int left=st.isEmpty()? -1 : st.peek();
                int right= i  ;

                int width= right - left -1;
                ans=Math.max(ans, width*heights[h]);
            }
            if(i<heights.length)st.push(i);
        }
        return ans;
    }
}