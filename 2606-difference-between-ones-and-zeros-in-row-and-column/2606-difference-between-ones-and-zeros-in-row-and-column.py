class Solution:
    def onesMinusZeros(self, grid: List[List[int]]) -> List[List[int]]:
        n = len(grid)
        m = len(grid[0])
        ones_row, ones_col, zeros_row, zeros_col = [0] * n, [0] * m, [0] * n, [0] * m
        
        for i in range(n):
            for j in range(m):
                if grid[i][j] == 0:
                    zeros_row[i] += 1
                    zeros_col[j] += 1
                else:
                    ones_row[i] += 1
                    ones_col[j] += 1
        
        res = [[0 for _ in range(m)] for _ in range(n)]

        for i in range(n):
            for j in range(m):
                res[i][j] = ones_row[i] + ones_col[j] - zeros_row[i] - zeros_col[j]
        
        return res