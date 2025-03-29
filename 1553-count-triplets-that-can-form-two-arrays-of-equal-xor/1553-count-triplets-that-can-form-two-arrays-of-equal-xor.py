class Solution:
    def countTriplets(self, arr: List[int]) -> int:
        n = len(arr)
        cum = [0] * (n + 1)
        cum[1] = arr[0]
        cnt = 0

        for i in range(2, n + 1):
            cum[i] = cum[i - 1] ^ arr[i - 1]
            
        for i in range(n + 1):
            for k in range(i + 1, n + 1):
                if cum[i] == cum[k]:
                    print(i, k)
                    cnt += (k - i - 1)
        
        return cnt
    