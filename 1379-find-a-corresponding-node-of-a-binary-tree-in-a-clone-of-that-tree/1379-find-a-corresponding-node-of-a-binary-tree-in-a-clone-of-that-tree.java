/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        int targetVal = target.val;
        TreeNode tn = dfs(cloned, targetVal);
        return tn;
    }
    
    TreeNode dfs(TreeNode t, int targetVal) {
        if (t == null) {
            return null;
        }
        if (t.val == targetVal) {
            return t;
        }
        
        
        TreeNode left = dfs(t.left, targetVal);
        TreeNode right = dfs(t.right, targetVal);
        if (left != null) {
            return left;
        } else {
            return right;
        }

    }
}