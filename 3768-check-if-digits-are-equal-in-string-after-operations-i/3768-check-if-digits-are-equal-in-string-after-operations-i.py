class Solution:
    def hasSameDigits(self, s: str) -> bool:
        while len(s) > 2:
            new_str = ""
            for i in range(len(s) - 1):
                val = str((int(s[i]) + int(s[i + 1])) % 10)
                new_str = new_str + val
            s = new_str
        
        return len(s) == 1 or s[0] == s[1] 