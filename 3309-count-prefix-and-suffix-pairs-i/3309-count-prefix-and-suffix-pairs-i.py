class Solution:
    def countPrefixSuffixPairs(self, words: List[str]) -> int:
        n = len(words)
        cnt = 0
        for i in range(n - 1):
            for j in range(i + 1, n):
                if isPrefixAndSuffix(words[i], words[j]):
                    cnt += 1
        return cnt

def isPrefixAndSuffix(s, word):
    return word.startswith(s) and word.endswith(s)