class Solution:
    def trimMean(self, arr: List[int]) -> float:
        arr.sort()
        n = len(arr)

        idx = math.floor(n * 5 / 100)

        return sum(arr[idx:n - idx]) / (n - idx * 2)
