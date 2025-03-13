# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def deepestLeavesSum(self, root: Optional[TreeNode]) -> int:
        
        cur = [root]
        pre = None

        while cur:
            pre, cur = cur, [child for node in cur for child in [node.left, node.right] if child]

        return sum(node.val for node in pre)
