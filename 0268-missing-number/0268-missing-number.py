class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n = len(nums)
        my_set = set([i for i in range(n + 1)])

        for num in nums:
            my_set.remove(num)
        
        return my_set.pop()