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
    int sum = 0;
    int low, high;
    public int rangeSumBST(TreeNode root, int low, int high) {
        this.low = low;
        this.high = high;
        
        dfs(root);
        
        return sum;
    }
    
    public void dfs(TreeNode tn) {
        if (tn == null) return;
        if (tn.val < low) {
            dfs(tn.right);
        } else if (tn.val > high) {
            dfs(tn.left);
        } else {
            sum += tn.val;
            dfs(tn.left);
            dfs(tn.right);
        }
    }
}