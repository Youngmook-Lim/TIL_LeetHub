class Solution(object):
    def similarPairs(self, words):
        """
        :type words: List[str]
        :rtype: int
        """
        cnt = 0
        for i in range(0, len(words) - 1):
            for j in range(i + 1, len(words)):
                if similar(words[i], words[j]):
                    cnt += 1
        return cnt
    
def similar(a, b):
    setA = set()
    setB = set()
    cnt = 0
    for c in a:
        setA.add(c)
    for c in b:
        setB.add(c)
    return setA == setB