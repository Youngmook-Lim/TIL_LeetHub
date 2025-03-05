class Solution:
    def pivotArray(self, nums: List[int], pivot: int) -> List[int]:
        n = len(nums)
        start = 0
        end = n - 1
        arr = [0] * n
   
        for i in range(n):
            num = nums[i]
            if num < pivot:
                arr[start] = num
                start += 1
            num2 = nums[n - 1 - i]
            if num2 > pivot:
                arr[end] = num2
                end -= 1

        while start <= end:
            arr[start] = pivot
            start += 1
        
        return arr
