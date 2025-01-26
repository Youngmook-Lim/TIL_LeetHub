class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        n = len(arr)
        maxi = -1

        for i in range(n - 1,  -1, -1):
            arr[i], maxi = maxi, max(maxi, arr[i])

        return arr