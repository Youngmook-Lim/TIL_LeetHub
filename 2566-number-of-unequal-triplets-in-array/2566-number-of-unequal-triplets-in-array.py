class Solution:
    def unequalTriplets(self, nums: List[int]) -> int:
        s = list(accumulate(Counter(nums).values()))
        sum = 0
        for i in range(1, len(s) - 1):
            sum += s[i - 1] * (s[i] - s[i - 1]) * (s[-1] - s[i])
        return sum