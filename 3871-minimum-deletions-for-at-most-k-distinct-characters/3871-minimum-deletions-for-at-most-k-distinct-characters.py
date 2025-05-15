class Solution:
    def minDeletion(self, s: str, k: int) -> int:
        dic = dict()
        arr = []

        for c in s:
            if c in dic:
                dic[c] += 1
            else:
                dic[c] = 1
        
        for c in dic:
            arr.append(dic[c])
        
        arr.sort()

        cnt = 0

        for i in range(len(arr) - k):
            cnt += arr[i]
        
        return cnt
