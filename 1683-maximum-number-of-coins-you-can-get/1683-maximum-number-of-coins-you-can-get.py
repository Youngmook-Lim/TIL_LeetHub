class Solution:
    def maxCoins(self, piles: List[int]) -> int:
        
        piles.sort(reverse=True)

        cnt = 0

        front, end = 1, len(piles) - 1

        while (front < end):
            cnt += piles[front]
            front += 2
            end -= 1
        
        return cnt

