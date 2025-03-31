class Solution:
    def spiralMatrixIII(self, rows: int, cols: int, rStart: int, cStart: int) -> List[List[int]]:
        total = rows * cols
        res = []
        r, c = rStart, cStart

        res.append([r, c])

        directions = [(0, 1), (1, 0), (0, -1), (-1, 0)]
        steps = 1

        while len(res) < total:
            for d in range(4):
                dr, dc = directions[d]
                for _ in range(steps):
                    r += dr
                    c += dc
                    if 0 <= r < rows and 0 <= c < cols:
                        res.append([r, c])
                    if len(res) >= total:
                        break
                if d % 2 == 1:
                    steps += 1
                if len(res) >= total:
                    break
                    
        return res