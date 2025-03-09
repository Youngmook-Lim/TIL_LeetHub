# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def reverseOddLevels(self, root: Optional[TreeNode]) -> Optional[TreeNode]:

        def dfs(left, right, depth):
            if depth % 2 == 0 and left is not None:
                left.val, right.val = right.val, left.val
            
            if (left is not None):
                dfs(left.left, right.right, depth + 1)
                dfs(left.right, right.left, depth + 1)

        dfs(root.left, root.right, 0)

        return root

    