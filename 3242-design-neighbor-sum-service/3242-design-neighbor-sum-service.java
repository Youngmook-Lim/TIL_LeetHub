class NeighborSum {
    
    int[][] grid;
    int n;

    public NeighborSum(int[][] grid) {
        this.n = grid.length;
        this.grid = grid;
    }
    
    public int adjacentSum(int value) {
        int i = 0;
        int j = 0;
        
        loop:
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                if (grid[y][x] == value) {
                    i = y;
                    j = x;
                    break loop;
                }
            }
        }
        
        int sum = 0;
        
        if (i + 1 < n) {
            sum += grid[i + 1][j];
        }
        if (i - 1 >= 0) {
            sum += grid[i - 1][j];
        }
        if (j + 1 < n) {
            sum += grid[i][j + 1];
        }
        if (j - 1 >= 0) {
            sum += grid[i][j - 1];
        }

        return sum;
    }
    
    public int diagonalSum(int value) {
        int i = 0;
        int j = 0;
        
        loop:
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                if (grid[y][x] == value) {
                    i = y;
                    j = x;
                    break loop;
                }
            }
        }
        
        int sum = 0;
        
        if (i + 1 < n && j + 1 < n) {
            sum += grid[i + 1][j + 1];
        }
        if (i - 1 >= 0 && j + 1 < n) {
            sum += grid[i - 1][j + 1];
        }
        if (i - 1 >= 0 && j - 1 >= 0) {
            sum += grid[i - 1][j - 1];
        }
        if (i + 1 < n && j - 1 >= 0) {
            sum += grid[i + 1][j - 1];
        }
        
        return sum;
    }
}

/**
 * Your NeighborSum object will be instantiated and called as such:
 * NeighborSum obj = new NeighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */