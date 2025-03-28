class Solution:
    def applyOperations(self, nums: List[int]) -> List[int]:
        n = len(nums)
        arr = [0] * n
        idx = 0

        for i in range(n - 1):
            if nums[i] == nums[i + 1]:
                nums[i] *= 2
                nums[i + 1] = 0
            if nums[i] > 0:
                arr[idx] = nums[i]
                idx += 1
        if nums[-1] > 0:
            arr[idx] = nums[-1]
            
        return arr