class Solution:
    def countPoints(self, points: List[List[int]], queries: List[List[int]]) -> List[int]:
        ret: List[int] = []

        for q in queries:
            x0, y0, r = q
            r_squared = r ** 2
            cnt = 0
            for p in points:
                x1, y1 = p
                dx = x1 - x0
                dy = y1 - y0
                if dx ** 2 + dy ** 2 <= r_squared:
                    cnt += 1
            ret.append(cnt)
        
        return ret