class Solution:
    def getMaximumXor(self, nums: List[int], maximumBit: int) -> List[int]:
        n = len(nums)
        arr = [0] * n

        mask = (1 << maximumBit) - 1
        init = 0
        
        for i in range(n):
            init ^= nums[i]

        for i in range(n):
            arr[i] = init ^ mask
            init ^= nums[n - 1 - i]

        return arr