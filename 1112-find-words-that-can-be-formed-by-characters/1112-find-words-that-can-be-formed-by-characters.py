class Solution:
    def countCharacters(self, words: List[str], chars: str) -> int:
        cnt = 0
        dic = {}
        for c in chars:
            if c in dic:
                dic[c] += 1
            else:
                dic[c] = 1

        for w in words:
            dicc = {}
            for c in w:
                if c in dicc:
                    dicc[c] += 1
                else:
                    dicc[c] = 1
            flag = True
            for k in dicc:
                if k not in dic or dicc[k] > dic[k]:
                    flag = False
                    break
            if flag:
                cnt += len(w)

        return cnt