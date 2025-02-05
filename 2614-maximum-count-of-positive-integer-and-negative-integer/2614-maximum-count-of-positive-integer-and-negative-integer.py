class Solution:
    def maximumCount(self, nums: List[int]) -> int:
        idx1 = self.find_last_neg(nums, 0, len(nums) - 1)
        idx2 = self.find_first_pos(nums, 0, len(nums) - 1)
        return max(idx1 + 1, len(nums) - idx2)
    
    def find_last_neg(self, nums, start, end):
        if start > end:
            return start - 1

        mid = (start + end) // 2
        n = nums[mid]
        if n < 0:
            return self.find_last_neg(nums, mid + 1, end)
        else:
            return self.find_last_neg(nums, start, mid - 1)
    
    def find_first_pos(self, nums, start, end):
        if start > end:
            return end + 1 

        mid = (start + end) // 2
        n = nums[mid]
        if n <= 0:
            return self.find_first_pos(nums, mid + 1, end)
        else:
            return self.find_first_pos(nums, start, mid - 1)