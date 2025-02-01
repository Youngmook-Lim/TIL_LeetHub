class Solution:
    def areNumbersAscending(self, s: str) -> bool:
        arr = s.split()
        prev = 0
        for n in arr:
            if n.isdigit():
                if int(n) > prev:
                    prev = int(n)
                else:
                    return False
        return True