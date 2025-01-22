class Solution:
    def construct2DArray(self, original: List[int], m: int, n: int) -> List[List[int]]:
        # Check if the transformation is possible
        if len(original) != m * n:
            return []
        
        # Use slicing to construct the 2D array directly
        return [original[i * n: (i + 1) * n] for i in range(m)]
