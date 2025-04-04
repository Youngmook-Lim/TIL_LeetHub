class Solution:
    def reverseDegree(self, s: str) -> int:
        return sum((i + 1) * (ord('z') - ord(s[i]) + 1) for i in range(len(s)))