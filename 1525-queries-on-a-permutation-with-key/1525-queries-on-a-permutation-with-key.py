class Solution:
    def processQueries(self, queries: List[int], m: int) -> List[int]:
        dq = deque()
        res = []

        for i in range(1, m + 1):
            dq.append(i)
        
        for q in queries:
            idx = dq.index(q)
            res.append(idx)
            dq.remove(q)
            dq.appendleft(q)
        
        return res