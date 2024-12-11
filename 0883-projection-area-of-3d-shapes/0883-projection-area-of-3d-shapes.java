class Solution {
    public int projectionArea(int[][] grid) {
        int total = 0;
        int n = grid.length;
        
        for (int i = 0; i < n; i++) {
            int max = 0;
            for (int j = 0; j < n; j++) {
                max = Math.max(max, grid[i][j]);
                if (grid[i][j] != 0) total++;
            }
            total += max;
        }
        
        for (int i = 0; i < n; i++) {
            int max = 0;
            for (int j = 0; j < n; j++) {
                max = Math.max(max, grid[j][i]);
            }
            total += max;
        }
        
        return total;
    }
}