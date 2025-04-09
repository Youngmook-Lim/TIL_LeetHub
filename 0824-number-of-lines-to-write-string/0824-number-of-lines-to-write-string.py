class Solution:
    def numberOfLines(self, widths: List[int], s: str) -> List[int]:
        lines = 1
        cnt = 0

        for i in range(len(s)):
            cur_len = widths[ord(s[i]) - ord('a')]
            if cnt + cur_len <= 100:
                cnt += cur_len
            else:
                lines += 1
                cnt = cur_len
        
        return [lines, cnt]