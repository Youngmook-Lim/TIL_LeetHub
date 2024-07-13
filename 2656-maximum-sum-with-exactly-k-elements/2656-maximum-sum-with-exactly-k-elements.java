class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = 0;
        for (int x : nums) {
            max = Math.max(max, x);
        }
        return k * (2 * max + k - 1) / 2;
    }
}