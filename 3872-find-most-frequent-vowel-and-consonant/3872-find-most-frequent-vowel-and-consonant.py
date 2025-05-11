class Solution:
    def maxFreqSum(self, s: str) -> int:
        arr = [0] * 26

        a = ord('a') - ord('a')
        e = ord('e') - ord('a')
        i = ord('i') - ord('a')
        o = ord('o') - ord('a')
        u = ord('u') - ord('a')

        v_max = 0
        c_max = 0

        for c in s:
            arr[ord(c) - ord('a')] += 1
        
        for k in range(len(arr)):
            if k == a or k == e or k == i or k == o or k == u:
                v_max = max(v_max, arr[k])
            else:
                c_max = max(c_max, arr[k])
            
        return v_max + c_max