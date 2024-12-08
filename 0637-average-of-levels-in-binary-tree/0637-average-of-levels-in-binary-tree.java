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
    double[] cnt = new double[1000];
    double[] sum = new double[1000];
    double[] average = new double[1000];
    int maxDepth = 0;
    
    public List<Double> averageOfLevels(TreeNode root) {
    
        dfs(root, 0);
        
        for (int i = 0; i <= maxDepth; i++) {
            average[i] = sum[i] / cnt[i];
        }
        
        List<Double> list = new ArrayList<>();
        for (int i = 0; i <= maxDepth; i++) {
            list.add(average[i]);
        }
        
        return list;
    }
    
    public void dfs(TreeNode node, int depth) {

        if (node == null) return;
        maxDepth = Math.max(maxDepth, depth);
        cnt[depth]++;
        sum[depth] += node.val;
        if (node.left != null) {
            dfs(node.left, depth + 1);
        }
        if (node.right != null) {
            dfs(node.right, depth + 1);
        }
    }
}