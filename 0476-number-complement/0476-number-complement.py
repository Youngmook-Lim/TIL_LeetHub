class Solution:
    def findComplement(self, num: int) -> int:
        length = len(bin(num)[2:])
        tmp = (1 << length) - 1

        flipped = num ^ tmp
        
        return flipped