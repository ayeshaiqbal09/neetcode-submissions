class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int fresh=0;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)fresh++;
                if(grid[i][j]==2)
                {
                    q.add(new int[]{i, j});
                }
            }
        }
        int dr[]={1, 0, -1, 0};
        int dc[]={0, -1, 0, 1};
        int res=0;
        while(!q.isEmpty() && fresh>0)
        {
            int size=q.size();
            
            
            for(int s=0;s<size;s++)
            {
                int arr[]=q.poll();
                for(int i=0;i<4;i++)
                {
                    int row=dr[i]+arr[0];
                    int col=dc[i]+arr[1];
                    if(row>=0 && row<n && col>=0 && col<m && grid[row][col]==1)
                    {
                        grid[row][col]=2;
                        q.add(new int[]{row, col});
                        fresh--;
                    }
                    
                }
            }
            res++;

        }
        return fresh==0?res:-1;
    }
    
}
