# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    

    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        l = []
        def traverse(root: Optional[TreeNode]):
            if root is not None:
                l.append(root.val)

                if root.left is not None:
                    traverse(root.left)
                if root.right is not None:
                    traverse(root.right)
        
        traverse(root)
        
        return l

