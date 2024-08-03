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
    public TreeNode searchBST(TreeNode root, int val) {
        int cur = root.val;
        if (cur == val) {
            return root;
        } else if (cur > val) {
            if (root.left != null) {
                return searchBST(root.left, val);    
            } else {
                return null;
            }        
        } else {
            if (root.right != null) {
                return searchBST(root.right, val);                
            } else {
                return null;
            }
        }
    }
}