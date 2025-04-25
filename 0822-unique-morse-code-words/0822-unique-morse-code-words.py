class Solution:
    def uniqueMorseRepresentations(self, words: List[str]) -> int:
        morse = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]

        my_set = set()

        for word in words:
            m = ""
            for l in word:
                m += morse[ord(l) - ord('a')]
            my_set.add(m)
        
        return len(my_set)