class Solution {
    public int[][] merge(int[][] intervals) {
        int i=0;
        int n=intervals.length;
        List<int[]> res=new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        while(i<n)
        {
            int start=intervals[i][0];
            int end=intervals[i][1];
            while(i+1<n && end>=intervals[i+1][0])
            {
                i++;
                end=Math.max(intervals[i][1], end);
            }
            res.add(new int[]{start, end});
            i++;
        }
        return res.toArray(new int[res.size()][]);
    }
}
