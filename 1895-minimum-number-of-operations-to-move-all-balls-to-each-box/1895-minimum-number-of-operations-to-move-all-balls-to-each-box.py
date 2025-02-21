class Solution:
    def minOperations(self, boxes: str) -> List[int]:
        n = len(boxes)
        forward = [0] * n
        backward = [0] * n
        forward_cnt = 0
        backward_cnt = 0

        res = [0] * n

        for i in range(1, n):
            forward[i] = forward[i - 1] + (1 if boxes[i - 1] == "1" else 0) + forward_cnt
            backward[i] = backward[i - 1] + (1 if boxes[n - i] == "1" else 0) + backward_cnt
            if (boxes[i - 1] == "1"):
                forward_cnt += 1
            if (boxes[n - i] == "1"):
                backward_cnt += 1

        for i in range(n):
            res[i] = forward[i] + backward[n - i - 1]

        return res