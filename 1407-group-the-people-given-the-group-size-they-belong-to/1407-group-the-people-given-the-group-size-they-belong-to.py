class Solution:
    def groupThePeople(self, groupSizes: List[int]) -> List[List[int]]:
        dic = {}
        for i in range(len(groupSizes)):
            if groupSizes[i] in dic:
                dic[groupSizes[i]].append(i)
            else:
                dic[groupSizes[i]] = [i]
        res = []
        for k in dic:
            n = len(dic[k])
            tmp = []
            for i in dic[k]:
                tmp.append(i)
                if len(tmp) == k:
                    res.append(tmp)
                    tmp = []
        
        return res