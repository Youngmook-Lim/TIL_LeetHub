class Solution:
    def countLargestGroup(self, n: int) -> int:
        my_dic = collections.defaultdict(int)
        maxi = 0
        cnt = 0

        for i in range(1, n + 1):
            total = 0
            m = i
            while m > 0:
                total += m % 10
                m //= 10
                
            my_dic[total] += 1
            
            if maxi < my_dic[total]:
                maxi = my_dic[total]
                cnt = 1
            elif maxi == my_dic[total]:
                cnt += 1
            
        return cnt
