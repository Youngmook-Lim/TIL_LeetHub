class Solution:
    def maxContainers(self, n: int, w: int, maxWeight: int) -> int:
        return n ** 2 if maxWeight > w * n ** 2 else maxWeight // w