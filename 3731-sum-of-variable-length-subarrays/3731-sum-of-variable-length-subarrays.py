class Solution:
    def subarraySum(self, nums: List[int]) -> int:
        arr = [0 for _ in range(len(nums) + 1)]
        for i in range(len(nums)):
            arr[i + 1] = arr[i] + nums[i]
        
        sum = 0
        for i in range(len(nums)):
            start = max(0, i - nums[i])
            sum += arr[i + 1] - arr[start]
        
        return sum