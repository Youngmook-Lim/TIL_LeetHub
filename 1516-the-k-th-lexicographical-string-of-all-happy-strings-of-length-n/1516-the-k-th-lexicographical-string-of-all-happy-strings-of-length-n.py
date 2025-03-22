class Solution:
    def getHappyString(self, n: int, k: int) -> str:
        arr = []
        cnt = 0 
        flag = True
        string = ""
        
        def dfs():
            nonlocal flag, cnt, string

            if not flag:
                return
            if len(arr) == n:
                cnt += 1
                if cnt == k:
                    string = "".join(arr)
                    flag = False
                return
            for char in ['a', 'b', 'c']:
                if len(arr) > 0:
                    if char == arr[-1]: continue
                arr.append(char)
                dfs()
                arr.pop()


        dfs()
        
        return string