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
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode tn = makeNode(nums, 0, nums.length - 1);
        
        return tn;
    }
    
    public TreeNode makeNode(int[] nums, int start, int end) {
        
        if (start > end) {
            return null;
        }
        
        int mid = (start + end) / 2;
        TreeNode tn = new TreeNode(nums[mid]);
        tn.left = makeNode(nums, start, mid - 1);
        tn.right = makeNode(nums, mid + 1, end);
        
        return tn;
    }

}

