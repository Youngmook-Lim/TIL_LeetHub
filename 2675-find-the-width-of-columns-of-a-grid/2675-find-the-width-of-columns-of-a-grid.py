class Solution:
    def findColumnWidth(self, grid: List[List[int]]) -> List[int]:
        arr = []
        n = len(grid)
        m = len(grid[0])

        for j in range(m):
            max_len = 0
            for i in range(n):
                max_len = max(max_len, len(str(grid[i][j])))
            arr.append(max_len)
        
        return arr
