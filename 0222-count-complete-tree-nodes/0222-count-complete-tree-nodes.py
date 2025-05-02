# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def countNodes(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        
        left_height = self.get_height(root.left)
        right_height = self.get_height(root.right)
        
        if left_height == right_height:
            # The left subtree is a complete binary tree
            return (1 << left_height) + self.countNodes(root.right)
        else:
            # The right subtree is a complete binary tree
            return (1 << right_height) + self.countNodes(root.left)

    def get_height(self, node):
        if not node:
            return 0
        return 1 + self.get_height(node.left)
