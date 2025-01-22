class Solution:
    def construct2DArray(self, original: List[int], m: int, n: int) -> List[List[int]]:
        
        target = n * m
        if target != len(original):
            return []

        graph = [[0 for _ in range(n)] for _ in range(m)]

        for i in range(len(original)):
            y = i // n
            x = i % n
            graph[y][x] = original[i]

        return graph