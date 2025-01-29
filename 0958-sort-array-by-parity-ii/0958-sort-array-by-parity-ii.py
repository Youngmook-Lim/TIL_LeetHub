class Solution:
    def sortArrayByParityII(self, nums: List[int]) -> List[int]:
        arr = [0 for _ in range(len(nums))]
        idxEven = 0
        idxOdd = 1
        for n in nums:
            if n % 2 == 0:
                arr[idxEven] = n
                idxEven += 2
            else:
                arr[idxOdd] = n
                idxOdd += 2
        
        return arr