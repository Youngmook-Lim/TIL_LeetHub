class Solution:
    def findTheArrayConcVal(self, nums: List[int]) -> int:
        n = 0
        start = 0
        end = len(nums) - 1
        while (start <= end):
            tmp = 0
            if (start == end):
                tmp = nums[start]
            else:
                tmp = int(str(nums[start]) + str(nums[end]))
            n += tmp
            start += 1
            end -= 1
        return n