class Solution:
    def toGoatLatin(self, sentence: str) -> str:
        res = ""
        cnt = 1

        arr = sentence.split(" ")
        for word in arr:
            w = ""
            if self.isVowel(word[0]):
                w = word + "ma"
            else:
                w = word[1:] + word[0] + "ma"
            w += "a" * cnt    
            res += w + " "
            cnt += 1

        return res.strip()

    def isVowel(self, c):
        return c.lower() in 'aeiou'