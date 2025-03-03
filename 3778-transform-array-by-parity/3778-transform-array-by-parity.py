class Solution:
    def transformArray(self, nums: List[int]) -> List[int]:
        n = len(nums)
        cnt = 0
        arr = [0] * n

        for i in nums:
            if i % 2 == 0:
                cnt += 1
        
        for i in range(cnt, n):
            arr[i] = 1
        
        return arr