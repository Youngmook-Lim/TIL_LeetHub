class Solution:
    def arrayRankTransform(self, arr: List[int]) -> List[int]:
        res = [0 for _ in range(len(arr))]
        dic = {}

        sorted_arr = sorted(arr)
        idx = 1

        for n in sorted_arr:
            if n not in dic:
                dic[n] = idx
                idx += 1
        
        for i in range(len(arr)):
            rank = dic[arr[i]]
            res[i] = rank
        
        return res
        