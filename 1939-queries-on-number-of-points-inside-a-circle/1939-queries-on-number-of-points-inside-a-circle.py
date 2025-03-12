class Solution:
    def countPoints(self, points: List[List[int]], queries: List[List[int]]) -> List[int]:
        ret: List[int] = []

        def get_distance(x1, y1, x0, y0):
            return math.sqrt((y1 - y0) ** 2 + (x1 - x0) ** 2)

        for q in queries:
            x = q[0]
            y = q[1]
            r = q[2]
            cnt = 0
            for p in points:
                dist = get_distance(x, y, p[0], p[1])
                if (dist <= r):
                    cnt += 1
            ret.append(cnt)
        
        return ret
