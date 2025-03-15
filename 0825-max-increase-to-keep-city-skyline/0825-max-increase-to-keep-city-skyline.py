class Solution:
    def maxIncreaseKeepingSkyline(self, grid: List[List[int]]) -> int:
        max_x = []
        max_y = []
        n = len(grid)
        total = 0

        def get_max(grid, n, k, type):
            maxi = 0
            for i in range(n):
                if type == "x":
                    maxi = max(maxi, grid[k][i])
                else:
                    maxi = max(maxi, grid[i][k])
            return maxi

        for i in range(n):
            max_x.append(get_max(grid, n, i, "x"))
            max_y.append(get_max(grid, n, i, "y"))
        
        for i in range(n):
            for j in range(n):
                mini = min(max_x[j], max_y[i])
                total += mini - grid[i][j]
        
        return total

