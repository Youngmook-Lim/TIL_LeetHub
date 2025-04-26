class Solution:
    def countLargestGroup(self, n: int) -> int:
        my_dic = {}
        maxi = 0
        cnt = 0

        for i in range(1, n + 1):
            sum = 0
            while i > 0:
                sum += i % 10
                i //= 10
            
            if sum in my_dic:
                my_dic[sum] += 1
            else:
                my_dic[sum] = 1
            
            maxi = max(maxi, my_dic[sum])

        for k in my_dic:
            if maxi == my_dic[k]:
                cnt += 1
            
        return cnt
