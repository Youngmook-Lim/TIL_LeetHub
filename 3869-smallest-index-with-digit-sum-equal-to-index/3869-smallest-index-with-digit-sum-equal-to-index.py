class Solution:
    def smallestIndex(self, nums: List[int]) -> int:
        
        for i in range(len(nums)):
            sum_digits = get_sum(nums[i])
            if i == sum_digits:
                return i
        
        return -1

def get_sum(n):
    total = 0
    while n > 0:
        total += n % 10
        n //= 10
    
    return total