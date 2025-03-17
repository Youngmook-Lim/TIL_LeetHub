# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def constructMaximumBinaryTree(self, nums: List[int]) -> Optional[TreeNode]:

        def make_tree(start, end, nums, node):
            idx = -1
            max_val = -1
            for i in range(start, end + 1):
                if nums[i] > max_val:
                    max_val = nums[i]
                    idx = i
            
            node.val = max_val

            if idx > start:
                tn = TreeNode()
                node.left = tn
                make_tree(start, idx - 1, nums, tn)
            if idx < end:
                tn = TreeNode()
                node.right = tn
                make_tree(idx + 1, end, nums, tn)
            
            return node
        
        return make_tree(0, len(nums) - 1, nums, TreeNode())
        