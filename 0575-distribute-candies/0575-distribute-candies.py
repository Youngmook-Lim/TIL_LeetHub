class Solution:
    def distributeCandies(self, candyType: List[int]) -> int:
        my_set = set(candyType)
        return min(len(candyType) // 2, len(my_set))