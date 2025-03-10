class Solution:
    def findMatrix(self, nums: List[int]) -> List[List[int]]:
        res: List[List[int]] = []
        my_dic: dict = {}
        flag: bool = False

        for n in nums:
            if n in my_dic:
                my_dic[n] += 1
            else:
                my_dic[n] = 1
        
        while (True):
            flag = False
            tmp: List[int] = []
            for k in my_dic:
                if my_dic[k] > 0:
                    flag = True
                    tmp.append(k)
                    my_dic[k] -= 1
            if not flag:
                break
            res.append(tmp)
        
        return res

