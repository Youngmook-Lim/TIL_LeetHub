class Solution {
    
    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};
    int n, m;
    int[][] grid;
    
    public int islandPerimeter(int[][] grid) {
        int total = 0;
        this.grid = grid;
        n = grid.length;
        m = grid[0].length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    total += getSides(i, j);
                }
            }
        }
        
        return total;
    }
    
    public int getSides(int y, int x) {
        int sum = 0;
        
        for (int k = 0; k < 4; k++) {
            int nx = x + dx[k];
            int ny = y + dy[k];
            if (nx < 0 || nx >= m || ny < 0 || ny >= n || grid[ny][nx] == 0) {
                sum++;
            }
        }
        
        return sum;
    }
}