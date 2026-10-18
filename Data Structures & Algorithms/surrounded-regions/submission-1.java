class Solution {
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        Queue<int[]> q=new LinkedList<>();
        boolean vis[][]=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==0 || j==0 || i==n-1 || j==m-1)
                {
                    if(board[i][j]=='O')
                    {
                        q.add(new int[]{i, j});
                        vis[i][j]=true;
                    }
                }
            }
        }
        int dr[]={1, 0, -1, 0};
        int dc[]={0, -1, 0, 1};
        while(!q.isEmpty())
        {
            int arr[]=q.poll();
            for(int i=0;i<4;i++)
            {
                int row=dr[i]+arr[0];
                int col=dc[i]+arr[1];
                if(row>=0 && row<n && col>=0 && col<m && board[row][col]=='O' && !vis[row][col])
                {
                    
                    q.add(new int[]{row, col});
                    vis[row][col]=true;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(vis[i][j]==false && board[i][j]=='O')
                {
                    board[i][j]='X';
                    vis[i][j]=true;
                }
            }
        }
    }
}
