class Solution:
    def greatestLetter(self, s: str) -> str:
        max_char = '0'
        my_set = set()
        for c in s:
            my_set.add(c)
            if c.lower() in my_set and c.upper() in my_set:
                if ord(c.upper()) > ord(max_char):
                    max_char = c.upper()
        
        return max_char if max_char != '0' else ''