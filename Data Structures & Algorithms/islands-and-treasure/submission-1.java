class Solution {
    int Rows, Cols, Inf = 2147483647;
    public void islandsAndTreasure(int[][] grid) {
        Rows = grid.length;
        Cols = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Cols; j++) {
                if (grid[i][j] == 0) {
                    q.add(new int[] {i, j});
                }
            }
        }
        
        int dR[] = {1, 0, -1, 0};
        int dC[] = {0, -1, 0, 1};
        
        while (!q.isEmpty()) {
            int a[] = q.poll();
            int row = a[0], col = a[1];
            for (int k = 0; k < 4; k++) {
                int nR = row + dR[k];
                int nC = col + dC[k];
                if (nR >= 0 && nR < Rows && nC >= 0 && nC < Cols && grid[nR][nC] == Inf) {
                    grid[nR][nC] = grid[row][col] + 1;
                    q.add(new int[] {nR, nC});
                }
            }
        }
    }
}