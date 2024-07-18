public class Solution {
    int[][] d = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 0}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};

    public int solution(int[][] board) {
        int n = board.length;
        boolean[][] unable = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    for (int[] k: d) {
                        int nearX = i + k[0];
                        int nearY = j + k[1];
                        if (nearX >= 0 && nearX < n && nearY >= 0 && nearY < n) {
                            unable[nearX][nearY] = true;
                        }
                    }
                } 
            }
        }

        int unableCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (unable[i][j]) {
                    unableCount++;
                }
            }
        }
        return n * n - unableCount;
    }
}