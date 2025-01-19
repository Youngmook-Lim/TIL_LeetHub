class Solution(object):
    def findWords(self, words):
        """
        :type words: List[str]
        :rtype: List[str]
        """
        set1 = {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p"}
        set2 = {"a", "s", "d", "f", "g", "h", "j", "k", "l"}
        set3 = {"z", "x", "c", "v", "b", "n", "m"}

        ret = []

        for w in words:
            if self.checkSet(w, set1):
                ret.append(w)
            elif self.checkSet(w, set2):
                ret.append(w)
            elif self.checkSet(w, set3):
                ret.append(w)
        
        return ret
    
    def checkSet(self, word, set):
        for c in word:
            if c.lower() not in set:
                return False
        return True