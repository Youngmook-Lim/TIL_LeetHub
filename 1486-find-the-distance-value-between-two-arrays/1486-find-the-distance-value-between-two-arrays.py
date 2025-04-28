class Solution:
    def findTheDistanceValue(self, arr1: List[int], arr2: List[int], d: int) -> int:
        cnt = 0

        for n in arr1:
            for m in arr2:
                if abs(n - m) <= d:
                    break
            else:
                cnt += 1
        
        return cnt