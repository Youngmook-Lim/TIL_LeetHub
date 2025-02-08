class Solution:
    def countPartitions(self, nums: List[int]) -> int:
        n = len(nums)
        cnt = 0
        arr = [0]
        for i in range(n):
            arr.append(arr[i] + nums[i])

        for i in range(1, n):
            if (arr[-1] - arr[i] * 2) % 2 == 0:
                cnt += 1
        
        return cnt