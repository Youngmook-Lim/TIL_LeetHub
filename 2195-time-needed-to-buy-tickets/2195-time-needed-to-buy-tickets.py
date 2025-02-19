class Solution:
    def timeRequiredToBuy(self, tickets: List[int], k: int) -> int:
        queue = deque()
        cnt = 0

        for i in range(len(tickets)):
            queue.append([i, tickets[i]])
        
        while True:
            cnt += 1
            t = queue.popleft()
            t[1] -= 1
            if t[1] != 0:
                queue.append(t)
            else:
                if t[0] == k:
                    return cnt