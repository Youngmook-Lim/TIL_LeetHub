# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def balanceBST(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        
        node_list = []

        def inorder(node):
            if node is None:
                return
            inorder(node.left)
            node_list.append(node.val)
            inorder(node.right)
        
        def sort_nodes(start, end):
            if (start > end):
                return None
            mid = (start + end) // 2
            tn = TreeNode(node_list[mid], sort_nodes(start, mid - 1), sort_nodes(mid + 1, end))
            return tn
        
        inorder(root)

        return sort_nodes(0, len(node_list) - 1)
