class Solution:
    def isCircularSentence(self, sentence: str) -> bool:
        arr = sentence.split(" ")
        for i in range(len(arr)):
            if arr[i][-1] != arr[(i + 1) % len(arr)][0]:
                return False
        return True