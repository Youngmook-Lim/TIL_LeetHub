class Solution:
    def validStrings(self, n: int) -> List[str]:
        result = []
        self.dfs(n, "", result)
        return result

    def dfs(self, n: int, current: str, result: List[str]):
        if len(current) == n:
            result.append(current)
            return
        
        self.dfs(n, current + '1', result)
        
        if not current or current[-1] != '0':
            self.dfs(n, current + '0', result)