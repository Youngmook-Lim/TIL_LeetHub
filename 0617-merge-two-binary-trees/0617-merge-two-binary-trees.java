/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return null;
        int value;
        if (root1 == null) {
            value = root2.val;
        } else if (root2 == null) {
            value = root1.val;
        } else {
            value = root1.val + root2.val;
        }
        TreeNode tn = new TreeNode(value);

        tn.left = mergeTrees(root1 == null ? null : root1.left, root2 == null ? null : root2.left);
        tn.right = mergeTrees(root1 == null ? null : root1.right, root2 == null ? null : root2.right);
        
        return tn;
    }
}