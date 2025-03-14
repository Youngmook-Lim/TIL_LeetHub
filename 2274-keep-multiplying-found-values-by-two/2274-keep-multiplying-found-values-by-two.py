class Solution:
    def findFinalValue(self, nums: List[int], original: int) -> int:
        my_set = set(nums)
        while (original in my_set):
            original *= 2
        return original