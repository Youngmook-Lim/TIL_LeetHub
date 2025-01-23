class Solution:
    def minOperations(self, logs: List[str]) -> int:
        level = 0
        for step in logs:
            if step == "../":
                level = max(level - 1, 0)
            elif step != "./":
                level += 1
        
        return level