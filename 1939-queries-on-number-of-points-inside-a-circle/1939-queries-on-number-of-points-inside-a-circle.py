class Solution:
    def countPoints(self, points: List[List[int]], queries: List[List[int]]) -> List[int]:
        ret: List[int] = []
        points.sort(key=lambda x: x[0])

        def get_distance(x1, y1, x0, y0):
            return math.sqrt((y1 - y0) ** 2 + (x1 - x0) ** 2)

        for q in queries:
            x = q[0]
            y = q[1]
            r = q[2]
            cnt = 0
            for p in points:
                px = p[0]
                py = p[1]
                if px + r < x:
                    continue
                if px - r > x:
                    break
                dist = get_distance(x, y, px, py)
                if (dist <= r):
                    cnt += 1
            ret.append(cnt)
        
        return ret
