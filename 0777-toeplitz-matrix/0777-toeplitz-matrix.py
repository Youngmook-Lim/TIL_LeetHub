class Solution:
    def isToeplitzMatrix(self, matrix: List[List[int]]) -> bool:
        
        n = len(matrix)
        m = len(matrix[0])
        for i in range(n - 1, -1, -1):
            x = 0
            y = i
            val = matrix[y][x]
            while y < n and x < m:
                if val != matrix[y][x]:
                    return False
                x += 1
                y += 1
        
        for i in range(m):
            x = i
            y = 0
            val = matrix[y][x]
            while y < n and x < m:
                if val != matrix[y][x]:
                    return False
                x += 1
                y += 1
        
        return True