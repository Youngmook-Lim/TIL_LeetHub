# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def averageOfSubtree(self, root: TreeNode) -> int:
        cnt = 0
        def dfs(node):
            
            nonlocal cnt
            
            sum1, cnt1, sum2, cnt2 = 0, 0, 0, 0

            if node.right is not None:
                sum1, cnt1 = dfs(node.right)
            if node.left is not None:
                sum2, cnt2 = dfs(node.left)
            
            total_sum = sum1 + sum2 + node.val
            total_cnt = cnt1 + cnt2 + 1
            average = total_sum // total_cnt

            if average == node.val:
                cnt += 1

            return total_sum, total_cnt
        
        dfs(root)

        return cnt