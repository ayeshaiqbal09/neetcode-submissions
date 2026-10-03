class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int i=1, ans=0, n=intervals.length;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int prev=intervals[0][1];
        while(i<n)
        {
            int start=intervals[i][0];
            int end=intervals[i][1];

            if(i<n && start>=prev)
            {
               prev=end;
            }
            else
            {
                ans++;
                prev=Math.min(end, prev);
            }
            i++;
        }
        return ans;
    }
}
