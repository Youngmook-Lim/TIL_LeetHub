class Solution:
    def minOperations(self, boxes: str) -> List[int]:
        n = len(boxes)
        forward = [0 for _ in range(n + 1)]
        backward = [0 for _ in range(n + 1)]
        forward_cnt = 0
        backward_cnt = 0
        res = [0 for _ in range(n)]

        for i in range(1, n + 1):
            forward[i] = forward[i - 1] + int(boxes[i - 1]) + forward_cnt
            backward[i] = backward[i - 1] + int(boxes[n - i]) + backward_cnt
            if (int(boxes[i - 1]) == 1):
                forward_cnt += 1
            if (int(boxes[n - i]) == 1):
                backward_cnt += 1

        for i in range(n):
            res[i] = forward[i] + backward[n - i - 1]

        return res