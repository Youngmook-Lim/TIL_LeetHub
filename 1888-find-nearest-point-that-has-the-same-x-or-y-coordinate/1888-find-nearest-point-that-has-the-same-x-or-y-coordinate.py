class Solution:
    def nearestValidPoint(self, x: int, y: int, points: List[List[int]]) -> int:
        dist = 10 ** 4
        idx = -1

        for i, p in enumerate(points):
            x1 = p[0]
            y1 = p[1]

            if x != x1 and y != y1:
                continue
            
            manhattan = abs(x - x1) + abs(y - y1)

            if manhattan < dist:
                idx = i
                dist = manhattan
        
        return idx
