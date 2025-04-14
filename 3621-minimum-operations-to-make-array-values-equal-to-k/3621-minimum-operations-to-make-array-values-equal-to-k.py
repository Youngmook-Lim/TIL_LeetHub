class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        arr = [0] * 101
        cnt = 0
        for n in nums:
            if n > k:
                if arr[n] == 0:
                    arr[n] = 1
                    cnt += 1
            elif n < k:
                return -1

        return cnt
        