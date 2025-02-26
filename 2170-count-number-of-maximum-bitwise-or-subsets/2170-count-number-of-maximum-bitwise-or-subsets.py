class Solution:

    ll = []
    n = 0
    nums = []
    cnt = 0
    maxi = 0

    def countMaxOrSubsets(self, nums: List[int]) -> int:
        self.n = len(nums)
        self.nums = nums
        for n in nums:
            self.maxi |= n
        
        self.dfs(0)

        return self.cnt
    
    def dfs(self, depth):
        self.check_list()
        if depth == self.n:
            return

        for i in range(depth, self.n):
            self.ll.append(self.nums[i])
            self.dfs(i + 1)
            self.ll.pop()
    
    def check_list(self):
        tmp = 0
        for n in self.ll:
            tmp |= n
        if tmp == self.maxi:
            self.cnt += 1