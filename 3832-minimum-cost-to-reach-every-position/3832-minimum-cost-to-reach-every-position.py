class Solution:
    def minCosts(self, cost: List[int]) -> List[int]:
        mini = 101
        return [mini := min(mini, cost[i]) for i in range(len(cost))]