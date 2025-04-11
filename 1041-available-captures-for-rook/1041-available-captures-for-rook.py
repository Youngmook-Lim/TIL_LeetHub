class Solution:
    def numRookCaptures(self, board: List[List[str]]) -> int:
        cnt = 0
        n = len(board)
        m = len(board[0])

        def count_rook(i, j):
            direction = [(1, 0), (-1, 0), (0, 1), (0, -1)]
            cnt = 0
            for d in direction:
                size = 1
                while True:
                    nx = j + d[0] * size
                    ny = i + d[1] * size
                    if nx < 0 or nx >= 8 or ny < 0 or ny >= 8:
                        break
                    if board[ny][nx] == 'B':
                        break
                    elif board[ny][nx] == 'p':
                        cnt += 1
                        break
                    size += 1
            return cnt

        for i in range(n):
            for j in range(m):
                if board[i][j] == 'R':
                    cnt = count_rook(i, j)
                    break
            else:
                continue
            break
        
        return cnt
        

        
