class Solution:
    def checkDistances(self, s: str, distance: List[int]) -> bool:
        arr = [-1 for _ in range(26)]
        for i in range(len(s)):
            c = s[i]
            order = ord(c) - ord('a')
            if arr[order] == -1:
                arr[order] = i
            else:
                arr[order] = i - arr[order] - 1
        for i in range(26):
            if arr[i] != -1 and arr[i] != distance[i]:
                return False
        
        return True