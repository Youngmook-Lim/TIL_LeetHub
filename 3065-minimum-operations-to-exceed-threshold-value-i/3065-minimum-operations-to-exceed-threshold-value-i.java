class Solution {
    public int minOperations(int[] nums, int k) {
        int cnt = 0;
        for (int x : nums) {
            if (x < k) cnt++;
        }
        return cnt;
    }
}