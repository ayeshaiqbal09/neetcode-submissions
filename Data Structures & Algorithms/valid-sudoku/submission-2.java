class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Row
        for (int row = 0; row < 9; row++) {
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                if (board[row][i] == '.')
                    continue;

                if (!set.add(board[row][i]))
                    return false;
            }
        }

        // Col
        for (int col = 0; col < 9; col++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[j][col] == '.')
                    continue;

                if (!set.add(board[j][col]))
                    return false;
            }
        }

        // square
        for (int sq = 0; sq < 9; sq++) {
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = (sq / 3) * 3 + i;
                    int col = (sq % 3) * 3 + j;
                    if (board[row][col] == '.')
                        continue;

                    if (!set.add(board[row][col]))
                        return false;
                }
            }
        }
        return true;
    }
}
