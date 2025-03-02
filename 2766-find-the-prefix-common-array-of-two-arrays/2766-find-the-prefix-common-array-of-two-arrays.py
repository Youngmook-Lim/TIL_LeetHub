class Solution:
    def findThePrefixCommonArray(self, A: List[int], B: List[int]) -> List[int]:
        n = len(A)
        seen = set()  # Using a set instead of dictionary
        res = [0] * n  # Simplified initialization
        common_count = 0
        
        for i in range(n):
            # Add A[i] to seen and check if it was in B's prefix
            if A[i] in seen:
                common_count += 1
            else:
                seen.add(A[i])
            
            # Add B[i] to seen and check if it was in A's prefix
            if B[i] in seen:
                common_count += 1
            else:
                seen.add(B[i])
            
            res[i] = common_count
            
        return res