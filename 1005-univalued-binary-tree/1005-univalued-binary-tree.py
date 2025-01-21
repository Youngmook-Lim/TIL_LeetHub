# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isUnivalTree(self, root: Optional[TreeNode]) -> bool:
        val = root.val
        return self.dfs(val, root)

    def dfs(self, val, root):
        if val != root.val:
            return False
        
        left = None
        right = None

        if root.left is not None:
            left = self.dfs(val, root.left)
        if root.right is not None:
            right = self.dfs(val, root.right)
        
        return left is not False and right is not False