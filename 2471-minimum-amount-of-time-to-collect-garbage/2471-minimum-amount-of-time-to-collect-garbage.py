class Solution:
    def garbageCollection(self, garbage: List[str], travel: List[int]) -> int:
        idx_p = 0
        idx_m = 0
        idx_g = 0

        cnt = 0
        total = 0

        for i in range(len(garbage)):
            g = garbage[i]
            if "G" in g:
                idx_g = i
                cnt += g.count("G")
            if "M" in g:
                idx_m = i
                cnt += g.count("M")
            if "P" in g:
                idx_p = i
                cnt += g.count("P")

        for i in range(1, len(travel)):
            travel[i] += travel[i - 1]
        
        total += cnt
        total += travel[idx_p - 1] if idx_p > 0 else 0
        total += travel[idx_g - 1] if idx_g > 0 else 0
        total += travel[idx_m - 1] if idx_m > 0 else 0

        return total