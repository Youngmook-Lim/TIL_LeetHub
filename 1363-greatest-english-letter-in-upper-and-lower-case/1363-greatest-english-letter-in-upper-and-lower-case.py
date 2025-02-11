class Solution:
    def greatestLetter(self, s: str) -> str:
        max_char = '0'
        my_set = set()
        for c in s:
            my_set.add(c)
            u = c.upper()
            if c.lower() in my_set and u in my_set:
                if ord(u) > ord(max_char):
                    max_char = u
        
        return max_char if max_char != '0' else ''