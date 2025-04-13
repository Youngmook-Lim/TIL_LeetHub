class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        idx = len(nums) - 1
        my_set = set()

        while idx >= 0:
            if nums[idx] in my_set:
                break
            else:
                my_set.add(nums[idx])
                idx -= 1
        
        return math.ceil((idx + 1) / 3) if idx >= 0 else 0