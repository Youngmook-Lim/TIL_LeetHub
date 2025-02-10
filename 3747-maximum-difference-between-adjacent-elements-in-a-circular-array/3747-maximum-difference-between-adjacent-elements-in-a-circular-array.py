class Solution:
    def maxAdjacentDistance(self, nums: List[int]) -> int:
        max_diff = 0
        n = len(nums)
        for i in range(n):
            max_diff = max(max_diff, abs(nums[(i + 1) % n] - nums[i]))

        return max_diff