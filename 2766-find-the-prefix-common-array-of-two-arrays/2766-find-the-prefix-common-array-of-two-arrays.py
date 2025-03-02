class Solution:
    def findThePrefixCommonArray(self, A: List[int], B: List[int]) -> List[int]:
        dic = {}
        n = len(A)
        cnt = 0
        res = [0 for _ in range(n)]

        for i in range(n):
            a = A[i]
            b = B[i]
            if a in dic:
                dic[a] += 1
            else:
                dic[a] = 1

            if b in dic:
                dic[b] += 1
            else:
                dic[b] = 1
            
            if dic[a] == 2:
                cnt += 1
                dic[a] = 0
            if dic[b] == 2:
                cnt += 1
                dic[b] = 0
            
            res[i] = cnt
        
        return res