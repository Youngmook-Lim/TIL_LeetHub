# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class FindElements:

    tn = None
    st = None

    def __init__(self, root: Optional[TreeNode]):
        self.st = set([0])
        root.val = 0
        self.dfs(root)
        self.tn = root

    def find(self, target: int) -> bool:
        return target in self.st

    def dfs(self, node):
        if node is None: return
        if node.left is not None:
            node.left.val = node.val * 2 + 1
            self.st.add(node.left.val)
            self.dfs(node.left)
        if node.right is not None:
            node.right.val = node.val * 2 + 2
            self.st.add(node.right.val)
            self.dfs(node.right)
        


# Your FindElements object will be instantiated and called as such:
# obj = FindElements(root)
# param_1 = obj.find(target)