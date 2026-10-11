class Solution {
    int row, col;
    public boolean exist(char[][] board, String word) {
        HashSet<Pair<Integer, Integer>> vis = new HashSet<>();
        row = board.length;
        col = board[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (dfs(i, j, word, vis, 0, board))
                    return true;
            }
        }
        return false;
    }
    public boolean dfs(
        int r, int c, String word, HashSet<Pair<Integer, Integer>> vis, int i, char[][] board) {
        if (i == word.length())
            return true;

        if (r < 0 || c < 0 || r >= row || c >= col || board[r][c] != word.charAt(i)
            || vis.contains(new Pair<>(r, c)))
            return false;
        vis.add(new Pair<>(r,c));
        boolean res = dfs(r + 1, c, word, vis, i + 1, board)
            || dfs(r - 1, c, word, vis, i + 1, board) || dfs(r, c + 1, word, vis, i + 1, board)
            || dfs(r, c - 1, word, vis, i + 1, board);
        vis.remove(new Pair<>(r,c));
        return res;
    }
}
