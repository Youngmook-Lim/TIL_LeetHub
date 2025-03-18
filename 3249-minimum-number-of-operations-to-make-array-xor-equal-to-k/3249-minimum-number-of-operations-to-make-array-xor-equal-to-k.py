class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        total = 0
        for n in nums:
            total ^= n
        
        sum = 0
        while total > 0 or k > 0:
            a = total % 2
            b = k % 2
            if a != b:
                sum += 1
            total >>= 1
            k >>= 1

        
        return sum