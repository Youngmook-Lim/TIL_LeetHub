# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sumEvenGrandparent(self, root: Optional[TreeNode]) -> int:
        def dfs(node):
            if node is None:
                return 0
            sumi = 0
            if node.val % 2 == 0:
                if node.left is not None:
                    if node.left.left is not None:
                        sumi += node.left.left.val
                    if node.left.right is not None:
                        sumi += node.left.right.val
                if node.right is not None:
                    if node.right.left is not None:
                        sumi += node.right.left.val
                    if node.right.right is not None:
                        sumi += node.right.right.val
            return dfs(node.left) + dfs(node.right) + sumi
        
        return dfs(root)