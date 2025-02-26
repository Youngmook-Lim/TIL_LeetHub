class Solution:
    def countMaxOrSubsets(self, nums: List[int]) -> int:
        max_or = 0
        for num in nums:
            max_or |= num
        
        def dfs(index, current_or, count):
            if current_or == max_or:
                count += 1
            for i in range(index, len(nums)):
                count = dfs(i + 1, current_or | nums[i], count)
            return count
        
        return dfs(0, 0, 0)