class Solution:
    def maxIncreaseKeepingSkyline(self, grid: List[List[int]]) -> int:
        max_x, max_y = list(map(max, grid)), list(map(max, zip(*grid)))

        return sum(min(x, y) for x in max_x for y in max_y) - sum(map(sum, grid))
        

