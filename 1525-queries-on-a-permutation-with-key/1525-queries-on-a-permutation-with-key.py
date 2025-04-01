from typing import List

class BIT:
    def __init__(self, n: int):
        self.n = n
        self.tree = [0] * (n + 1)
    
    def update(self, i: int, delta: int) -> None:
        while i <= self.n:
            self.tree[i] += delta
            i += i & -i  # Move to next index
    
    def query(self, i: int) -> int:
        s = 0
        while i:
            s += self.tree[i]
            i -= i & -i  # Move to parent index
        return s

class Solution:
    def processQueries(self, queries: List[int], m: int) -> List[int]:
        n = len(queries)
        size = m + n  # Extra space to allow moving elements to the front
        bit = BIT(size)
        
        # pos[i] will store the current index of element i
        pos = [0] * (m + 1)
        for i in range(1, m + 1):
            pos[i] = n + i  # Place each element starting from index n+1
            bit.update(n + i, 1)
        
        result = []
        current_top = n  # Next available position for moving an element to the front
        
        for q in queries:
            original_pos = pos[q]
            # Get the number of elements before the current element q
            rank = bit.query(original_pos) - 1
            result.append(rank)
            
            # Remove element q from its current position
            bit.update(original_pos, -1)
            # Move q to the front (using current_top index)
            pos[q] = current_top
            bit.update(current_top, 1)
            current_top -= 1
            
        return result
