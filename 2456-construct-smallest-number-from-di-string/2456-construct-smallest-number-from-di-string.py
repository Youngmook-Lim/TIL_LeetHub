class Solution:
    def smallestNumber(self, pattern: str) -> str:
        n = len(pattern)
        result = []
        stack = []
        
        for i in range(n + 1):
            # Push the next smallest digit
            stack.append(str(i + 1))
            # If we encounter 'I' or reach the end, reverse the stack and append to result
            if i == n or pattern[i] == 'I':
                result.extend(stack[::-1])
                stack = []
        
        return ''.join(result)