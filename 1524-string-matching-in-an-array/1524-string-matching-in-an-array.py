class Solution:
    def stringMatching(self, words: List[str]) -> List[str]:
        arr = []
        for i in range(len(words) - 1):
            for j in range(i + 1, len(words)):
                a = words[i]
                b = words[j]
                if a == 'X' or b == 'X':
                    continue
                    
                if a in b:
                    arr.append(a)
                    words[i] = 'X'
                elif b in a:
                    arr.append(b)
                    words[j] = 'X'
        
        return arr