class Solution {
    public int projectionArea(int[][] grid) {
        int total = 0;
        int n = grid.length;
        
        for (int i = 0; i < n; i++) {
            int max1 = 0;
            int max2 = 0;
            for (int j = 0; j < n; j++) {
                max1 = Math.max(max1, grid[i][j]);
                max2 = Math.max(max2, grid[j][i]);
                if (grid[i][j] != 0) total++;
            }
            total += max1;
            total += max2;
        }
        
        return total;
    }
}