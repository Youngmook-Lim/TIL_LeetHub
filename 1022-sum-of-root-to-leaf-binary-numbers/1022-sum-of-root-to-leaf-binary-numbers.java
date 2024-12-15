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
    
    int total = 0;
    
    public int sumRootToLeaf(TreeNode root) {
        dfs(root, 0);
        return total;
    }
    
    public void dfs(TreeNode node, int sum) {
        
        sum <<= 1;
        sum += node.val;
        
        if (node.left != null) {
            dfs(node.left, sum);
        }
        if (node.right != null) {
            dfs(node.right, sum);
        }
        if (node.left == null && node.right == null) {
            total += sum;
        }
    }
}